/*
 * Copyright 2012 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.focustech.cookinglove.base;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SecurityContextHandle.java
 * 
 * @author xiajinming
 */
public class SecurityContextHandler {
	/** 线程变量，存放用户的登录信息，request对象以及response对象 */
	public static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>();

	public static User getUser() {
		Object obj = getMap().get("user");
		return obj == null ? null : ((User) obj);
	}

	public static void setUser(User user) {
		getMap().put("user", user);
	}

	public static HttpServletRequest getRequest() {
		Object obj = getMap().get("request");
		return obj == null ? null : ((HttpServletRequest) obj);
	}

	public static void setRequest(HttpServletRequest request) {
		getMap().put("request", request);
	}

	public static HttpServletResponse getResponse() {
		Object obj = getMap().get("response");
		return obj == null ? null : ((HttpServletResponse) obj);
	}

	public static void setResponse(HttpServletResponse httpServletResponse) {
		getMap().put("response", httpServletResponse);
	}

	public static boolean isLogon() {
		return getUser() == null;
	}

	public static long getUserId() {
		User user = getUser();
		return user == null ? 0 : user.getUserId();
	}

	public static String getUserType() {
		User user = getUser();
		return user == null ? "" : user.getUserType();
	}

	public static String getStatus() {
		User user = getUser();
		return user == null ? "" : user.getStatus();
	}

	public static String getNickName() {
		User user = getUser();
		return user == null ? "" : user.getNickName();
	}

	private static Map<String, Object> getMap() {
		if (threadLocal.get() == null) {
			threadLocal.set(new HashMap<String, Object>());
		}
		return threadLocal.get();
	}
}
