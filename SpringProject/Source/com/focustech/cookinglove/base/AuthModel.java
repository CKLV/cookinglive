/*
 * Copyright 2012 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.focustech.cookinglove.base;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * AuthModel.java
 * 
 * @author sweed0
 */
public class AuthModel {
	private String regex;
	private List<String> userType;
	private List<String> status;
	private Pattern pattern;

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public List<String> getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		if (StringUtils.isNotBlank(userType)) {
			this.userType = Arrays.asList(userType.split(","));
		}
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (StringUtils.isNotBlank(status)) {
			this.status = Arrays.asList(status.split(","));
		}
	}

	/**
	 * url权限匹配，匹配用户的身份类型及状态
	 * 
	 * 不匹配有两种情况，1是url为匹配不到到，此时需要返回true，2是url匹配到但是验证失败，此时需要返回false，为
	 * 区分匹配不到，匹配到验证失败，匹配到验证成功这三种情况，此处返回数字
	 * 
	 * @param uri
	 * @return 1匹配成功且验证成功;0 url不匹配;-1 url匹配但用户身份类型验证失败 -2 url匹配身份类型正确但用户状态错误
	 */
	public int match(String uri) {

		if (!getPattern().matcher(uri).find()) {
			// url不匹配
			return 0;
		}
		if (!(getUserType() == null || getUserType().size() < 1 || getUserType()
				.contains(SecurityContextHandler.getUserType()))) {
			// 身份类型验证失败
			return -1;
		}
		if (!(getStatus() == null || getStatus().size() < 1 || getStatus()
				.contains(SecurityContextHandler.getStatus()))) {
			// 用户状态验证失败
			return -2;
		}
		// 验证成功
		return 1;
	}

	private Pattern getPattern() {
		if (pattern == null) {
			pattern = Pattern.compile(getRegex());
		}
		return pattern;
	}

}
