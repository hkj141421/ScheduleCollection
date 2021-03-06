package com.knight.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class scheduleTaskConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public scheduleTaskConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTasknameIsNull() {
            addCriterion("taskName is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskName is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskName =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskName <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskName >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskName >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskName <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskName <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskName like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskName not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskName in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskName not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskName between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskName not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIsNull() {
            addCriterion("taskStatus is null");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIsNotNull() {
            addCriterion("taskStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstatusEqualTo(String value) {
            addCriterion("taskStatus =", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotEqualTo(String value) {
            addCriterion("taskStatus <>", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusGreaterThan(String value) {
            addCriterion("taskStatus >", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusGreaterThanOrEqualTo(String value) {
            addCriterion("taskStatus >=", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLessThan(String value) {
            addCriterion("taskStatus <", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLessThanOrEqualTo(String value) {
            addCriterion("taskStatus <=", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLike(String value) {
            addCriterion("taskStatus like", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotLike(String value) {
            addCriterion("taskStatus not like", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIn(List<String> values) {
            addCriterion("taskStatus in", values, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotIn(List<String> values) {
            addCriterion("taskStatus not in", values, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusBetween(String value1, String value2) {
            addCriterion("taskStatus between", value1, value2, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotBetween(String value1, String value2) {
            addCriterion("taskStatus not between", value1, value2, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskintervalIsNull() {
            addCriterion("taskInterval is null");
            return (Criteria) this;
        }

        public Criteria andTaskintervalIsNotNull() {
            addCriterion("taskInterval is not null");
            return (Criteria) this;
        }

        public Criteria andTaskintervalEqualTo(Long value) {
            addCriterion("taskInterval =", value, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalNotEqualTo(Long value) {
            addCriterion("taskInterval <>", value, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalGreaterThan(Long value) {
            addCriterion("taskInterval >", value, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalGreaterThanOrEqualTo(Long value) {
            addCriterion("taskInterval >=", value, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalLessThan(Long value) {
            addCriterion("taskInterval <", value, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalLessThanOrEqualTo(Long value) {
            addCriterion("taskInterval <=", value, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalIn(List<Long> values) {
            addCriterion("taskInterval in", values, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalNotIn(List<Long> values) {
            addCriterion("taskInterval not in", values, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalBetween(Long value1, Long value2) {
            addCriterion("taskInterval between", value1, value2, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andTaskintervalNotBetween(Long value1, Long value2) {
            addCriterion("taskInterval not between", value1, value2, "taskinterval");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeIsNull() {
            addCriterion("lastExecuteTime is null");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeIsNotNull() {
            addCriterion("lastExecuteTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeEqualTo(Date value) {
            addCriterion("lastExecuteTime =", value, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeNotEqualTo(Date value) {
            addCriterion("lastExecuteTime <>", value, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeGreaterThan(Date value) {
            addCriterion("lastExecuteTime >", value, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastExecuteTime >=", value, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeLessThan(Date value) {
            addCriterion("lastExecuteTime <", value, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastExecuteTime <=", value, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeIn(List<Date> values) {
            addCriterion("lastExecuteTime in", values, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeNotIn(List<Date> values) {
            addCriterion("lastExecuteTime not in", values, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeBetween(Date value1, Date value2) {
            addCriterion("lastExecuteTime between", value1, value2, "lastexecutetime");
            return (Criteria) this;
        }

        public Criteria andLastexecutetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastExecuteTime not between", value1, value2, "lastexecutetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 28 16:54:50 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ScheduleTaskConfig
     *
     * @mbg.generated Sat Dec 28 16:54:50 CST 2019
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
}