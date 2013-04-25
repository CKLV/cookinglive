/*
 * Copyright 2012 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.focustech.cookinglove.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.focustech.cookinglove.base.AuthModel;
import com.focustech.cookinglove.base.SecurityContextHandler;
import com.focustech.cookinglove.web.service.SecurityService;

/**
 * 对用户访问的html或json请求进行登录以及访问权限认证
 * 
 * @author xiajinming
 */
public class SecurityFilter extends HandlerInterceptorAdapter {

	private String loginUrl;
	private String nopermitUrl;
	
	
	@Autowired
	private SecurityService securityService;

	/**
	 * 存放需要验证的url
	 */
	private List<AuthModel> authUrlList;

	/**
	 * 在所有请求处理完成之后被调用
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	/**
	 * 处理请求之后，试图渲染之前
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object object, ModelAndView model) throws Exception {
		String url=request.getRequestURI();
		if((url.endsWith(".html") || url.indexOf(".html?")>0) && model!=null){
			model.addObject("user",SecurityContextHandler.getUser());
		}
	}

	/**
	 * 请求处理之前
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2) throws Exception {
		String url = request.getRequestURI();
		if (authUrlList != null) {
			// matchFlag
			for (AuthModel model : authUrlList) {
				try {
					int matchResult = model.match(url);
					if (matchResult == 1) {
						return true;
					} else if (matchResult < 0) {
						if (matchResult == -1) {
							// 对未登录的访问，跳转到登录页面
							StringBuffer buffer = new StringBuffer(loginUrl);
							if (StringUtils.isNotBlank(url)) {
								buffer.append("?nexturl=").append(url);
							}
							response.sendRedirect(buffer.toString());
						} else {
							// 对于其他如身份类型不符或用户状态不正确者，提示器无权进行此操作
							url = request.getHeader("Referer");
							// request.getRequestDispatcher(nopermitUrl).forward(
							// request, response);
							StringBuffer buffer = new StringBuffer(nopermitUrl);
							if (StringUtils.isNotBlank(url)) {
								buffer.append("?nexturl=").append(url);
							}
							response.sendRedirect(buffer.toString());
						}
						return false;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}

	/**
	 * 初始化需要验证的url
	 */
	public void init() {
		authUrlList=securityService.getUrlList();
	}

	public List<AuthModel> getAuthUrlList() {
		return authUrlList;
	}

	public void setAuthUrlList(List<AuthModel> authUrlList) {
		this.authUrlList = authUrlList;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getNopermitUrl() {
		return nopermitUrl;
	}

	public void setNopermitUrl(String nopermitUrl) {
		this.nopermitUrl = nopermitUrl;
	}

}
