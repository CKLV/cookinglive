package com.focustech.cookinglove.ibator.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoreLogonInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public CoreLogonInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andLogUsernameIsNull() {
			addCriterion("log_username is null");
			return (Criteria) this;
		}

		public Criteria andLogUsernameIsNotNull() {
			addCriterion("log_username is not null");
			return (Criteria) this;
		}

		public Criteria andLogUsernameEqualTo(String value) {
			addCriterion("log_username =", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameNotEqualTo(String value) {
			addCriterion("log_username <>", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameGreaterThan(String value) {
			addCriterion("log_username >", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("log_username >=", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameLessThan(String value) {
			addCriterion("log_username <", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameLessThanOrEqualTo(String value) {
			addCriterion("log_username <=", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameLike(String value) {
			addCriterion("log_username like", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameNotLike(String value) {
			addCriterion("log_username not like", value, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameIn(List<String> values) {
			addCriterion("log_username in", values, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameNotIn(List<String> values) {
			addCriterion("log_username not in", values, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameBetween(String value1, String value2) {
			addCriterion("log_username between", value1, value2, "logUsername");
			return (Criteria) this;
		}

		public Criteria andLogUsernameNotBetween(String value1, String value2) {
			addCriterion("log_username not between", value1, value2,
					"logUsername");
			return (Criteria) this;
		}

		public Criteria andLogPasswordIsNull() {
			addCriterion("log_password is null");
			return (Criteria) this;
		}

		public Criteria andLogPasswordIsNotNull() {
			addCriterion("log_password is not null");
			return (Criteria) this;
		}

		public Criteria andLogPasswordEqualTo(String value) {
			addCriterion("log_password =", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordNotEqualTo(String value) {
			addCriterion("log_password <>", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordGreaterThan(String value) {
			addCriterion("log_password >", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("log_password >=", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordLessThan(String value) {
			addCriterion("log_password <", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordLessThanOrEqualTo(String value) {
			addCriterion("log_password <=", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordLike(String value) {
			addCriterion("log_password like", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordNotLike(String value) {
			addCriterion("log_password not like", value, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordIn(List<String> values) {
			addCriterion("log_password in", values, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordNotIn(List<String> values) {
			addCriterion("log_password not in", values, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordBetween(String value1, String value2) {
			addCriterion("log_password between", value1, value2, "logPassword");
			return (Criteria) this;
		}

		public Criteria andLogPasswordNotBetween(String value1, String value2) {
			addCriterion("log_password not between", value1, value2,
					"logPassword");
			return (Criteria) this;
		}

		public Criteria andEmailAddressIsNull() {
			addCriterion("email_address is null");
			return (Criteria) this;
		}

		public Criteria andEmailAddressIsNotNull() {
			addCriterion("email_address is not null");
			return (Criteria) this;
		}

		public Criteria andEmailAddressEqualTo(String value) {
			addCriterion("email_address =", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressNotEqualTo(String value) {
			addCriterion("email_address <>", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressGreaterThan(String value) {
			addCriterion("email_address >", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressGreaterThanOrEqualTo(String value) {
			addCriterion("email_address >=", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressLessThan(String value) {
			addCriterion("email_address <", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressLessThanOrEqualTo(String value) {
			addCriterion("email_address <=", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressLike(String value) {
			addCriterion("email_address like", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressNotLike(String value) {
			addCriterion("email_address not like", value, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressIn(List<String> values) {
			addCriterion("email_address in", values, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressNotIn(List<String> values) {
			addCriterion("email_address not in", values, "emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressBetween(String value1, String value2) {
			addCriterion("email_address between", value1, value2,
					"emailAddress");
			return (Criteria) this;
		}

		public Criteria andEmailAddressNotBetween(String value1, String value2) {
			addCriterion("email_address not between", value1, value2,
					"emailAddress");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNull() {
			addCriterion("nick_name is null");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNotNull() {
			addCriterion("nick_name is not null");
			return (Criteria) this;
		}

		public Criteria andNickNameEqualTo(String value) {
			addCriterion("nick_name =", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotEqualTo(String value) {
			addCriterion("nick_name <>", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThan(String value) {
			addCriterion("nick_name >", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThanOrEqualTo(String value) {
			addCriterion("nick_name >=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThan(String value) {
			addCriterion("nick_name <", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThanOrEqualTo(String value) {
			addCriterion("nick_name <=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLike(String value) {
			addCriterion("nick_name like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotLike(String value) {
			addCriterion("nick_name not like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameIn(List<String> values) {
			addCriterion("nick_name in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotIn(List<String> values) {
			addCriterion("nick_name not in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameBetween(String value1, String value2) {
			addCriterion("nick_name between", value1, value2, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotBetween(String value1, String value2) {
			addCriterion("nick_name not between", value1, value2, "nickName");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNull() {
			addCriterion("user_type is null");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNotNull() {
			addCriterion("user_type is not null");
			return (Criteria) this;
		}

		public Criteria andUserTypeEqualTo(String value) {
			addCriterion("user_type =", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotEqualTo(String value) {
			addCriterion("user_type <>", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThan(String value) {
			addCriterion("user_type >", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
			addCriterion("user_type >=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThan(String value) {
			addCriterion("user_type <", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThanOrEqualTo(String value) {
			addCriterion("user_type <=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLike(String value) {
			addCriterion("user_type like", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotLike(String value) {
			addCriterion("user_type not like", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeIn(List<String> values) {
			addCriterion("user_type in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotIn(List<String> values) {
			addCriterion("user_type not in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeBetween(String value1, String value2) {
			addCriterion("user_type between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotBetween(String value1, String value2) {
			addCriterion("user_type not between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNull() {
			addCriterion("user_status is null");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNotNull() {
			addCriterion("user_status is not null");
			return (Criteria) this;
		}

		public Criteria andUserStatusEqualTo(String value) {
			addCriterion("user_status =", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotEqualTo(String value) {
			addCriterion("user_status <>", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThan(String value) {
			addCriterion("user_status >", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
			addCriterion("user_status >=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThan(String value) {
			addCriterion("user_status <", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThanOrEqualTo(String value) {
			addCriterion("user_status <=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLike(String value) {
			addCriterion("user_status like", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotLike(String value) {
			addCriterion("user_status not like", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusIn(List<String> values) {
			addCriterion("user_status in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotIn(List<String> values) {
			addCriterion("user_status not in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusBetween(String value1, String value2) {
			addCriterion("user_status between", value1, value2, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotBetween(String value1, String value2) {
			addCriterion("user_status not between", value1, value2,
					"userStatus");
			return (Criteria) this;
		}

		public Criteria andActivityFlagIsNull() {
			addCriterion("activity_flag is null");
			return (Criteria) this;
		}

		public Criteria andActivityFlagIsNotNull() {
			addCriterion("activity_flag is not null");
			return (Criteria) this;
		}

		public Criteria andActivityFlagEqualTo(String value) {
			addCriterion("activity_flag =", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagNotEqualTo(String value) {
			addCriterion("activity_flag <>", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagGreaterThan(String value) {
			addCriterion("activity_flag >", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagGreaterThanOrEqualTo(String value) {
			addCriterion("activity_flag >=", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagLessThan(String value) {
			addCriterion("activity_flag <", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagLessThanOrEqualTo(String value) {
			addCriterion("activity_flag <=", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagLike(String value) {
			addCriterion("activity_flag like", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagNotLike(String value) {
			addCriterion("activity_flag not like", value, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagIn(List<String> values) {
			addCriterion("activity_flag in", values, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagNotIn(List<String> values) {
			addCriterion("activity_flag not in", values, "activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagBetween(String value1, String value2) {
			addCriterion("activity_flag between", value1, value2,
					"activityFlag");
			return (Criteria) this;
		}

		public Criteria andActivityFlagNotBetween(String value1, String value2) {
			addCriterion("activity_flag not between", value1, value2,
					"activityFlag");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNull() {
			addCriterion("add_time is null");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNotNull() {
			addCriterion("add_time is not null");
			return (Criteria) this;
		}

		public Criteria andAddTimeEqualTo(Date value) {
			addCriterion("add_time =", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotEqualTo(Date value) {
			addCriterion("add_time <>", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThan(Date value) {
			addCriterion("add_time >", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("add_time >=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThan(Date value) {
			addCriterion("add_time <", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThanOrEqualTo(Date value) {
			addCriterion("add_time <=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeIn(List<Date> values) {
			addCriterion("add_time in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotIn(List<Date> values) {
			addCriterion("add_time not in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeBetween(Date value1, Date value2) {
			addCriterion("add_time between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotBetween(Date value1, Date value2) {
			addCriterion("add_time not between", value1, value2, "addTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table core_logon_info
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core_logon_info
     *
     * @mbggenerated do_not_delete_during_merge Wed Nov 14 20:05:40 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}