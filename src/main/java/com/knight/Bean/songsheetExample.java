package com.knight.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class songsheetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public songsheetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
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
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
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

        public Criteria andSheetidIsNull() {
            addCriterion("SheetId is null");
            return (Criteria) this;
        }

        public Criteria andSheetidIsNotNull() {
            addCriterion("SheetId is not null");
            return (Criteria) this;
        }

        public Criteria andSheetidEqualTo(Long value) {
            addCriterion("SheetId =", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotEqualTo(Long value) {
            addCriterion("SheetId <>", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidGreaterThan(Long value) {
            addCriterion("SheetId >", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidGreaterThanOrEqualTo(Long value) {
            addCriterion("SheetId >=", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidLessThan(Long value) {
            addCriterion("SheetId <", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidLessThanOrEqualTo(Long value) {
            addCriterion("SheetId <=", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidIn(List<Long> values) {
            addCriterion("SheetId in", values, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotIn(List<Long> values) {
            addCriterion("SheetId not in", values, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidBetween(Long value1, Long value2) {
            addCriterion("SheetId between", value1, value2, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotBetween(Long value1, Long value2) {
            addCriterion("SheetId not between", value1, value2, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameIsNull() {
            addCriterion("SongSheetName is null");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameIsNotNull() {
            addCriterion("SongSheetName is not null");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameEqualTo(String value) {
            addCriterion("SongSheetName =", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameNotEqualTo(String value) {
            addCriterion("SongSheetName <>", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameGreaterThan(String value) {
            addCriterion("SongSheetName >", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameGreaterThanOrEqualTo(String value) {
            addCriterion("SongSheetName >=", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameLessThan(String value) {
            addCriterion("SongSheetName <", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameLessThanOrEqualTo(String value) {
            addCriterion("SongSheetName <=", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameLike(String value) {
            addCriterion("SongSheetName like", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameNotLike(String value) {
            addCriterion("SongSheetName not like", value, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameIn(List<String> values) {
            addCriterion("SongSheetName in", values, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameNotIn(List<String> values) {
            addCriterion("SongSheetName not in", values, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameBetween(String value1, String value2) {
            addCriterion("SongSheetName between", value1, value2, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andSongsheetnameNotBetween(String value1, String value2) {
            addCriterion("SongSheetName not between", value1, value2, "songsheetname");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCoverimgIsNull() {
            addCriterion("CoverImg is null");
            return (Criteria) this;
        }

        public Criteria andCoverimgIsNotNull() {
            addCriterion("CoverImg is not null");
            return (Criteria) this;
        }

        public Criteria andCoverimgEqualTo(String value) {
            addCriterion("CoverImg =", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotEqualTo(String value) {
            addCriterion("CoverImg <>", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgGreaterThan(String value) {
            addCriterion("CoverImg >", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgGreaterThanOrEqualTo(String value) {
            addCriterion("CoverImg >=", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLessThan(String value) {
            addCriterion("CoverImg <", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLessThanOrEqualTo(String value) {
            addCriterion("CoverImg <=", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgLike(String value) {
            addCriterion("CoverImg like", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotLike(String value) {
            addCriterion("CoverImg not like", value, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgIn(List<String> values) {
            addCriterion("CoverImg in", values, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotIn(List<String> values) {
            addCriterion("CoverImg not in", values, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgBetween(String value1, String value2) {
            addCriterion("CoverImg between", value1, value2, "coverimg");
            return (Criteria) this;
        }

        public Criteria andCoverimgNotBetween(String value1, String value2) {
            addCriterion("CoverImg not between", value1, value2, "coverimg");
            return (Criteria) this;
        }

        public Criteria andProducerIsNull() {
            addCriterion("Producer is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("Producer is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("Producer =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("Producer <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("Producer >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("Producer >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("Producer <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("Producer <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("Producer like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("Producer not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("Producer in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("Producer not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("Producer between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("Producer not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("Time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("Time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("Time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("Time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("Time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("Time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("Time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("Time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("Time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("Time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("Time not between", value1, value2, "time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table songsheet
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 28 16:52:58 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table songsheet
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
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