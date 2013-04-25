package com.focustech.cookinglove.ibator.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCardExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public UserCardExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_card
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user_card
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

		public Criteria andRecIdIsNull() {
			addCriterion("rec_id is null");
			return (Criteria) this;
		}

		public Criteria andRecIdIsNotNull() {
			addCriterion("rec_id is not null");
			return (Criteria) this;
		}

		public Criteria andRecIdEqualTo(Long value) {
			addCriterion("rec_id =", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdNotEqualTo(Long value) {
			addCriterion("rec_id <>", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdGreaterThan(Long value) {
			addCriterion("rec_id >", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdGreaterThanOrEqualTo(Long value) {
			addCriterion("rec_id >=", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdLessThan(Long value) {
			addCriterion("rec_id <", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdLessThanOrEqualTo(Long value) {
			addCriterion("rec_id <=", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdIn(List<Long> values) {
			addCriterion("rec_id in", values, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdNotIn(List<Long> values) {
			addCriterion("rec_id not in", values, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdBetween(Long value1, Long value2) {
			addCriterion("rec_id between", value1, value2, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdNotBetween(Long value1, Long value2) {
			addCriterion("rec_id not between", value1, value2, "recId");
			return (Criteria) this;
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

		public Criteria andRealNameIsNull() {
			addCriterion("real_name is null");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNotNull() {
			addCriterion("real_name is not null");
			return (Criteria) this;
		}

		public Criteria andRealNameEqualTo(String value) {
			addCriterion("real_name =", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotEqualTo(String value) {
			addCriterion("real_name <>", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThan(String value) {
			addCriterion("real_name >", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThanOrEqualTo(String value) {
			addCriterion("real_name >=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThan(String value) {
			addCriterion("real_name <", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThanOrEqualTo(String value) {
			addCriterion("real_name <=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLike(String value) {
			addCriterion("real_name like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotLike(String value) {
			addCriterion("real_name not like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameIn(List<String> values) {
			addCriterion("real_name in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotIn(List<String> values) {
			addCriterion("real_name not in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameBetween(String value1, String value2) {
			addCriterion("real_name between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotBetween(String value1, String value2) {
			addCriterion("real_name not between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(String value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(String value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(String value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(String value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(String value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(String value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLike(String value) {
			addCriterion("gender like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotLike(String value) {
			addCriterion("gender not like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<String> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<String> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(String value1, String value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(String value1, String value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGraduateFromIsNull() {
			addCriterion("graduate_from is null");
			return (Criteria) this;
		}

		public Criteria andGraduateFromIsNotNull() {
			addCriterion("graduate_from is not null");
			return (Criteria) this;
		}

		public Criteria andGraduateFromEqualTo(String value) {
			addCriterion("graduate_from =", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromNotEqualTo(String value) {
			addCriterion("graduate_from <>", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromGreaterThan(String value) {
			addCriterion("graduate_from >", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromGreaterThanOrEqualTo(String value) {
			addCriterion("graduate_from >=", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromLessThan(String value) {
			addCriterion("graduate_from <", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromLessThanOrEqualTo(String value) {
			addCriterion("graduate_from <=", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromLike(String value) {
			addCriterion("graduate_from like", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromNotLike(String value) {
			addCriterion("graduate_from not like", value, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromIn(List<String> values) {
			addCriterion("graduate_from in", values, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromNotIn(List<String> values) {
			addCriterion("graduate_from not in", values, "graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromBetween(String value1, String value2) {
			addCriterion("graduate_from between", value1, value2,
					"graduateFrom");
			return (Criteria) this;
		}

		public Criteria andGraduateFromNotBetween(String value1, String value2) {
			addCriterion("graduate_from not between", value1, value2,
					"graduateFrom");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIsNull() {
			addCriterion("company_name is null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIsNotNull() {
			addCriterion("company_name is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameEqualTo(String value) {
			addCriterion("company_name =", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotEqualTo(String value) {
			addCriterion("company_name <>", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThan(String value) {
			addCriterion("company_name >", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
			addCriterion("company_name >=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThan(String value) {
			addCriterion("company_name <", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThanOrEqualTo(String value) {
			addCriterion("company_name <=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLike(String value) {
			addCriterion("company_name like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotLike(String value) {
			addCriterion("company_name not like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIn(List<String> values) {
			addCriterion("company_name in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotIn(List<String> values) {
			addCriterion("company_name not in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameBetween(String value1, String value2) {
			addCriterion("company_name between", value1, value2, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotBetween(String value1, String value2) {
			addCriterion("company_name not between", value1, value2,
					"companyName");
			return (Criteria) this;
		}

		public Criteria andJobNameIsNull() {
			addCriterion("job_name is null");
			return (Criteria) this;
		}

		public Criteria andJobNameIsNotNull() {
			addCriterion("job_name is not null");
			return (Criteria) this;
		}

		public Criteria andJobNameEqualTo(String value) {
			addCriterion("job_name =", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotEqualTo(String value) {
			addCriterion("job_name <>", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameGreaterThan(String value) {
			addCriterion("job_name >", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameGreaterThanOrEqualTo(String value) {
			addCriterion("job_name >=", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameLessThan(String value) {
			addCriterion("job_name <", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameLessThanOrEqualTo(String value) {
			addCriterion("job_name <=", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameLike(String value) {
			addCriterion("job_name like", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotLike(String value) {
			addCriterion("job_name not like", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameIn(List<String> values) {
			addCriterion("job_name in", values, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotIn(List<String> values) {
			addCriterion("job_name not in", values, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameBetween(String value1, String value2) {
			addCriterion("job_name between", value1, value2, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotBetween(String value1, String value2) {
			addCriterion("job_name not between", value1, value2, "jobName");
			return (Criteria) this;
		}

		public Criteria andCardStatusIsNull() {
			addCriterion("card_status is null");
			return (Criteria) this;
		}

		public Criteria andCardStatusIsNotNull() {
			addCriterion("card_status is not null");
			return (Criteria) this;
		}

		public Criteria andCardStatusEqualTo(String value) {
			addCriterion("card_status =", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusNotEqualTo(String value) {
			addCriterion("card_status <>", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusGreaterThan(String value) {
			addCriterion("card_status >", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusGreaterThanOrEqualTo(String value) {
			addCriterion("card_status >=", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusLessThan(String value) {
			addCriterion("card_status <", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusLessThanOrEqualTo(String value) {
			addCriterion("card_status <=", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusLike(String value) {
			addCriterion("card_status like", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusNotLike(String value) {
			addCriterion("card_status not like", value, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusIn(List<String> values) {
			addCriterion("card_status in", values, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusNotIn(List<String> values) {
			addCriterion("card_status not in", values, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusBetween(String value1, String value2) {
			addCriterion("card_status between", value1, value2, "cardStatus");
			return (Criteria) this;
		}

		public Criteria andCardStatusNotBetween(String value1, String value2) {
			addCriterion("card_status not between", value1, value2,
					"cardStatus");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andTelphoneIsNull() {
			addCriterion("telphone is null");
			return (Criteria) this;
		}

		public Criteria andTelphoneIsNotNull() {
			addCriterion("telphone is not null");
			return (Criteria) this;
		}

		public Criteria andTelphoneEqualTo(String value) {
			addCriterion("telphone =", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneNotEqualTo(String value) {
			addCriterion("telphone <>", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneGreaterThan(String value) {
			addCriterion("telphone >", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
			addCriterion("telphone >=", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneLessThan(String value) {
			addCriterion("telphone <", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneLessThanOrEqualTo(String value) {
			addCriterion("telphone <=", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneLike(String value) {
			addCriterion("telphone like", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneNotLike(String value) {
			addCriterion("telphone not like", value, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneIn(List<String> values) {
			addCriterion("telphone in", values, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneNotIn(List<String> values) {
			addCriterion("telphone not in", values, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneBetween(String value1, String value2) {
			addCriterion("telphone between", value1, value2, "telphone");
			return (Criteria) this;
		}

		public Criteria andTelphoneNotBetween(String value1, String value2) {
			addCriterion("telphone not between", value1, value2, "telphone");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeIsNull() {
			addCriterion("last_update_time is null");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeIsNotNull() {
			addCriterion("last_update_time is not null");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeEqualTo(Date value) {
			addCriterion("last_update_time =", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeNotEqualTo(Date value) {
			addCriterion("last_update_time <>", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeGreaterThan(Date value) {
			addCriterion("last_update_time >", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("last_update_time >=", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeLessThan(Date value) {
			addCriterion("last_update_time <", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("last_update_time <=", value, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeIn(List<Date> values) {
			addCriterion("last_update_time in", values, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeNotIn(List<Date> values) {
			addCriterion("last_update_time not in", values, "lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("last_update_time between", value1, value2,
					"lastUpdateTime");
			return (Criteria) this;
		}

		public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("last_update_time not between", value1, value2,
					"lastUpdateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user_card
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
     * This class corresponds to the database table user_card
     *
     * @mbggenerated do_not_delete_during_merge Wed Nov 14 20:05:40 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}