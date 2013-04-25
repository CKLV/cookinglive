package com.focustech.cookinglove.filter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

import com.focustech.cookinglove.base.IPRange;
import com.focustech.cookinglove.tool.WebTool;

/**
 * 进行安全IP验证
 * @author xiajinming
 *
 */
public class SecurityIpFilter extends HandlerInterceptorAdapter {
	
	private static List<IPRange> list;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String ip=WebTool.getIp(request);
		for(IPRange ipRange:list){
			if(ipRange.isIn(ip)){
				return true;
			}
		}
		//重新跳转到登录页面，并提示此IP非安全IP，请联系管理员。
		
		return false;
	}
	
	/**
	 * 安全IP记录从数据库中初始化
	 */
	public void init(){
		list=new ArrayList<IPRange>();
	}
	
}
