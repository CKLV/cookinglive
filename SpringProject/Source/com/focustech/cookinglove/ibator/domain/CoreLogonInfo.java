package com.focustech.cookinglove.ibator.domain;

import java.util.Date;

public class CoreLogonInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.user_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.log_username
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private String logUsername;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.log_password
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private String logPassword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.email_address
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private String emailAddress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.nick_name
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private String nickName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.user_type
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private String userType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.user_status
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private String userStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.activity_flag
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private String activityFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column core_logon_info.add_time
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	private Date addTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.user_id
	 * @return  the value of core_logon_info.user_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.user_id
	 * @param userId  the value for core_logon_info.user_id
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.log_username
	 * @return  the value of core_logon_info.log_username
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getLogUsername() {
		return logUsername;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.log_username
	 * @param logUsername  the value for core_logon_info.log_username
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setLogUsername(String logUsername) {
		this.logUsername = logUsername == null ? null : logUsername.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.log_password
	 * @return  the value of core_logon_info.log_password
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getLogPassword() {
		return logPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.log_password
	 * @param logPassword  the value for core_logon_info.log_password
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setLogPassword(String logPassword) {
		this.logPassword = logPassword == null ? null : logPassword.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.email_address
	 * @return  the value of core_logon_info.email_address
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.email_address
	 * @param emailAddress  the value for core_logon_info.email_address
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress == null ? null : emailAddress.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.nick_name
	 * @return  the value of core_logon_info.nick_name
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.nick_name
	 * @param nickName  the value for core_logon_info.nick_name
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.user_type
	 * @return  the value of core_logon_info.user_type
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.user_type
	 * @param userType  the value for core_logon_info.user_type
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setUserType(String userType) {
		this.userType = userType == null ? null : userType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.user_status
	 * @return  the value of core_logon_info.user_status
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getUserStatus() {
		return userStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.user_status
	 * @param userStatus  the value for core_logon_info.user_status
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus == null ? null : userStatus.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.activity_flag
	 * @return  the value of core_logon_info.activity_flag
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getActivityFlag() {
		return activityFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.activity_flag
	 * @param activityFlag  the value for core_logon_info.activity_flag
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setActivityFlag(String activityFlag) {
		this.activityFlag = activityFlag == null ? null : activityFlag.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column core_logon_info.add_time
	 * @return  the value of core_logon_info.add_time
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column core_logon_info.add_time
	 * @param addTime  the value for core_logon_info.add_time
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}