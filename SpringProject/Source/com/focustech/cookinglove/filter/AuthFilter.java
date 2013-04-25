/*
 * Copyright 2012 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.focustech.cookinglove.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

import com.focustech.cookinglove.base.SecurityContextHandler;
import com.focustech.cookinglove.base.User;
import com.focustech.cookinglove.tool.CookieTool;

/**
 * 对每次.json以及.html的请求设置登录用户信息
 * 
 * 
 * @author xiajinming
 */
public class AuthFilter extends GenericFilterBean {

	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		SecurityContextHandler.setRequest((HttpServletRequest) servletRequest);
		SecurityContextHandler
				.setResponse((HttpServletResponse) servletResponse);
		User user = CookieTool.getUser();
		if (user != null) {
			SecurityContextHandler.setUser(user);
			//重新写入cookie
			CookieTool.writeUser(user);
		} else {
//			User virtualUser = new User();
//			virtualUser.setUserId(1);
//			virtualUser.setStatus("0");
//			virtualUser.setUserType("1");
//			SecurityContextHandler.setUser(virtualUser);
		}
		filterChain.doFilter(servletRequest, servletResponse);
	}
}
