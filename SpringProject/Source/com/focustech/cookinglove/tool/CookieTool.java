/*
 * Copyright 2012 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.focustech.cookinglove.tool;

import java.util.Date;

import javax.servlet.http.Cookie;

import org.apache.commons.lang.StringUtils;

import com.focustech.cookinglove.base.SecurityContextHandler;
import com.focustech.cookinglove.base.User;
import com.focustech.cookinglove.ibator.domain.CoreLogonInfo;

/**
 * CookieTool.java
 * 
 * @author xiajinming
 */
public class CookieTool {

	/***
	 * 根据name获取value值ֵ
	 * 
	 * @param name
	 * @return
	 */
	public static String getCookie(String name) {
		Cookie[] cookies = SecurityContextHandler.getRequest().getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(name)) {
					return cookie.getValue();
				}
			}
		}
		return "";
	}

	/**
	 * 将键值对写入cookie
	 * 
	 * @param name
	 * @param value
	 */
	public static void writeCookie(String name, String value) {
		Cookie cookie = new Cookie(name, value);
		finishCookie(cookie);
	}

	/**
	 * 将用户写入cookie
	 * 
	 * @param user
	 */
	public static void writeUser(CoreLogonInfo coreLogonInfo) {
		User user=new User();
		user.load(coreLogonInfo);
		writeUser(user);
	}
	
	/**
	 * 讲user写入cookie
	 * @param user
	 */
	public static void writeUser(User user){
		writeCookie("_user_id", String.valueOf(user.getUserId()));
		writeCookie("_nick_name", user.getNickName());
		writeCookie("_user_status", user.getStatus());
		writeCookie("_user_type", user.getUserType());
		writeCookie("_last_access_time", String.valueOf(new Date().getTime()));
	}

	/**
	 * 从cookie中获取用户信息
	 * 
	 * @return
	 */
	public static User getUser() {
		User user = null;
		String userId = getCookie("_user_id");
		if (StringUtils.isNotBlank(userId)) {
			user = new User();
			user.setUserId(Long.valueOf(userId));
			user.setLastAccessTime(Long.valueOf(getCookie("_last_access_time")));
			user.setNickName(getCookie("_nick_name"));
			user.setStatus(getCookie("_user_status"));
			user.setUserType(getCookie("_user_type"));
		}
		return user;
	}
	
	public static void clearUser(){
		User user=new User();
		CookieTool.writeUser(user);
	}

	/**
	 * 完成cookie中的剩余操作
	 * 
	 * @param cookie
	 */
	private static void finishCookie(Cookie cookie) {
		cookie.setDomain("localhost");
		cookie.setMaxAge(30 * 60 * 1000);
		cookie.setPath("/");
		SecurityContextHandler.getResponse().addCookie(cookie);
	}
}
