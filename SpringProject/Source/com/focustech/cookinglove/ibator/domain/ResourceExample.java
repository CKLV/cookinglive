package com.focustech.cookinglove.ibator.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public ResourceExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table resource
	 * @mbggenerated  Tue Nov 27 21:19:28 CST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table resource
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

		public Criteria andResourceIdIsNull() {
			addCriterion("resource_id is null");
			return (Criteria) this;
		}

		public Criteria andResourceIdIsNotNull() {
			addCriterion("resource_id is not null");
			return (Criteria) this;
		}

		public Criteria andResourceIdEqualTo(Long value) {
			addCriterion("resource_id =", value, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdNotEqualTo(Long value) {
			addCriterion("resource_id <>", value, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdGreaterThan(Long value) {
			addCriterion("resource_id >", value, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdGreaterThanOrEqualTo(Long value) {
			addCriterion("resource_id >=", value, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdLessThan(Long value) {
			addCriterion("resource_id <", value, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdLessThanOrEqualTo(Long value) {
			addCriterion("resource_id <=", value, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdIn(List<Long> values) {
			addCriterion("resource_id in", values, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdNotIn(List<Long> values) {
			addCriterion("resource_id not in", values, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdBetween(Long value1, Long value2) {
			addCriterion("resource_id between", value1, value2, "resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceIdNotBetween(Long value1, Long value2) {
			addCriterion("resource_id not between", value1, value2,
					"resourceId");
			return (Criteria) this;
		}

		public Criteria andResourceNameIsNull() {
			addCriterion("resource_name is null");
			return (Criteria) this;
		}

		public Criteria andResourceNameIsNotNull() {
			addCriterion("resource_name is not null");
			return (Criteria) this;
		}

		public Criteria andResourceNameEqualTo(String value) {
			addCriterion("resource_name =", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotEqualTo(String value) {
			addCriterion("resource_name <>", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameGreaterThan(String value) {
			addCriterion("resource_name >", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
			addCriterion("resource_name >=", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameLessThan(String value) {
			addCriterion("resource_name <", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameLessThanOrEqualTo(String value) {
			addCriterion("resource_name <=", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameLike(String value) {
			addCriterion("resource_name like", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotLike(String value) {
			addCriterion("resource_name not like", value, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameIn(List<String> values) {
			addCriterion("resource_name in", values, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotIn(List<String> values) {
			addCriterion("resource_name not in", values, "resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameBetween(String value1, String value2) {
			addCriterion("resource_name between", value1, value2,
					"resourceName");
			return (Criteria) this;
		}

		public Criteria andResourceNameNotBetween(String value1, String value2) {
			addCriterion("resource_name not between", value1, value2,
					"resourceName");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdIsNull() {
			addCriterion("parent_resource_id is null");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdIsNotNull() {
			addCriterion("parent_resource_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdEqualTo(Long value) {
			addCriterion("parent_resource_id =", value, "parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdNotEqualTo(Long value) {
			addCriterion("parent_resource_id <>", value, "parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdGreaterThan(Long value) {
			addCriterion("parent_resource_id >", value, "parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdGreaterThanOrEqualTo(Long value) {
			addCriterion("parent_resource_id >=", value, "parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdLessThan(Long value) {
			addCriterion("parent_resource_id <", value, "parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdLessThanOrEqualTo(Long value) {
			addCriterion("parent_resource_id <=", value, "parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdIn(List<Long> values) {
			addCriterion("parent_resource_id in", values, "parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdNotIn(List<Long> values) {
			addCriterion("parent_resource_id not in", values,
					"parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdBetween(Long value1, Long value2) {
			addCriterion("parent_resource_id between", value1, value2,
					"parentResourceId");
			return (Criteria) this;
		}

		public Criteria andParentResourceIdNotBetween(Long value1, Long value2) {
			addCriterion("parent_resource_id not between", value1, value2,
					"parentResourceId");
			return (Criteria) this;
		}

		public Criteria andResourceUrlIsNull() {
			addCriterion("resource_url is null");
			return (Criteria) this;
		}

		public Criteria andResourceUrlIsNotNull() {
			addCriterion("resource_url is not null");
			return (Criteria) this;
		}

		public Criteria andResourceUrlEqualTo(String value) {
			addCriterion("resource_url =", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotEqualTo(String value) {
			addCriterion("resource_url <>", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlGreaterThan(String value) {
			addCriterion("resource_url >", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlGreaterThanOrEqualTo(String value) {
			addCriterion("resource_url >=", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlLessThan(String value) {
			addCriterion("resource_url <", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlLessThanOrEqualTo(String value) {
			addCriterion("resource_url <=", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlLike(String value) {
			addCriterion("resource_url like", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotLike(String value) {
			addCriterion("resource_url not like", value, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlIn(List<String> values) {
			addCriterion("resource_url in", values, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotIn(List<String> values) {
			addCriterion("resource_url not in", values, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlBetween(String value1, String value2) {
			addCriterion("resource_url between", value1, value2, "resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceUrlNotBetween(String value1, String value2) {
			addCriterion("resource_url not between", value1, value2,
					"resourceUrl");
			return (Criteria) this;
		}

		public Criteria andResourceStatusIsNull() {
			addCriterion("resource_status is null");
			return (Criteria) this;
		}

		public Criteria andResourceStatusIsNotNull() {
			addCriterion("resource_status is not null");
			return (Criteria) this;
		}

		public Criteria andResourceStatusEqualTo(String value) {
			addCriterion("resource_status =", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusNotEqualTo(String value) {
			addCriterion("resource_status <>", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusGreaterThan(String value) {
			addCriterion("resource_status >", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusGreaterThanOrEqualTo(String value) {
			addCriterion("resource_status >=", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusLessThan(String value) {
			addCriterion("resource_status <", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusLessThanOrEqualTo(String value) {
			addCriterion("resource_status <=", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusLike(String value) {
			addCriterion("resource_status like", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusNotLike(String value) {
			addCriterion("resource_status not like", value, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusIn(List<String> values) {
			addCriterion("resource_status in", values, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusNotIn(List<String> values) {
			addCriterion("resource_status not in", values, "resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusBetween(String value1, String value2) {
			addCriterion("resource_status between", value1, value2,
					"resourceStatus");
			return (Criteria) this;
		}

		public Criteria andResourceStatusNotBetween(String value1, String value2) {
			addCriterion("resource_status not between", value1, value2,
					"resourceStatus");
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

		public Criteria andRepTimeIsNull() {
			addCriterion("rep_time is null");
			return (Criteria) this;
		}

		public Criteria andRepTimeIsNotNull() {
			addCriterion("rep_time is not null");
			return (Criteria) this;
		}

		public Criteria andRepTimeEqualTo(Date value) {
			addCriterion("rep_time =", value, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeNotEqualTo(Date value) {
			addCriterion("rep_time <>", value, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeGreaterThan(Date value) {
			addCriterion("rep_time >", value, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("rep_time >=", value, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeLessThan(Date value) {
			addCriterion("rep_time <", value, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeLessThanOrEqualTo(Date value) {
			addCriterion("rep_time <=", value, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeIn(List<Date> values) {
			addCriterion("rep_time in", values, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeNotIn(List<Date> values) {
			addCriterion("rep_time not in", values, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeBetween(Date value1, Date value2) {
			addCriterion("rep_time between", value1, value2, "repTime");
			return (Criteria) this;
		}

		public Criteria andRepTimeNotBetween(Date value1, Date value2) {
			addCriterion("rep_time not between", value1, value2, "repTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table resource
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
     * This class corresponds to the database table resource
     *
     * @mbggenerated do_not_delete_during_merge Wed Nov 14 20:05:40 CST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}