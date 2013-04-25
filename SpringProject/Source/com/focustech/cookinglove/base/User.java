/*
 * Copyright 2012 Focus Technology, Co., Ltd. All rights reserved.
 */
package com.focustech.cookinglove.base;

import java.io.Serializable;
import java.util.Date;

import com.focustech.cookinglove.ibator.domain.CoreLogonInfo;

/**
 * User.java
 * 
 * @author xiajinming
 */
public class User implements Serializable {

	/* 用户ID */
	private long userId;
	/* 用户昵称 */
	private String nickName;
	/* 用户状态 */
	private String status;
	/* 上次访问时间 */
	private long lastAccessTime;
	/* 用户身份类型 */
	private String userType;
	/*用户登录名*/
	private String logUsername;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getLastAccessTime() {
		return lastAccessTime;
	}

	public void setLastAccessTime(long lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getLogUsername() {
		return logUsername;
	}

	public void setLogUsername(String logUsername) {
		this.logUsername = logUsername;
	}

	public void load(CoreLogonInfo coreLogonInfo){
		this.userId=coreLogonInfo.getUserId();
		this.nickName=coreLogonInfo.getNickName();
		this.status=coreLogonInfo.getUserStatus();
		this.userType=coreLogonInfo.getUserType();
		this.lastAccessTime=new Date().getTime();
		this.logUsername=coreLogonInfo.getLogUsername();
	}

}
