package com.knight.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class trackcommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public trackcommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
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
     * This method corresponds to the database table trackcomment
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
     * This method corresponds to the database table trackcomment
     *
     * @mbg.generated Sat Dec 28 16:52:58 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackcomment
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
     * This class corresponds to the database table trackcomment
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

        public Criteria andTrackidIsNull() {
            addCriterion("trackId is null");
            return (Criteria) this;
        }

        public Criteria andTrackidIsNotNull() {
            addCriterion("trackId is not null");
            return (Criteria) this;
        }

        public Criteria andTrackidEqualTo(Long value) {
            addCriterion("trackId =", value, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidNotEqualTo(Long value) {
            addCriterion("trackId <>", value, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidGreaterThan(Long value) {
            addCriterion("trackId >", value, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidGreaterThanOrEqualTo(Long value) {
            addCriterion("trackId >=", value, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidLessThan(Long value) {
            addCriterion("trackId <", value, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidLessThanOrEqualTo(Long value) {
            addCriterion("trackId <=", value, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidIn(List<Long> values) {
            addCriterion("trackId in", values, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidNotIn(List<Long> values) {
            addCriterion("trackId not in", values, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidBetween(Long value1, Long value2) {
            addCriterion("trackId between", value1, value2, "trackid");
            return (Criteria) this;
        }

        public Criteria andTrackidNotBetween(Long value1, Long value2) {
            addCriterion("trackId not between", value1, value2, "trackid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andFabulousIsNull() {
            addCriterion("Fabulous is null");
            return (Criteria) this;
        }

        public Criteria andFabulousIsNotNull() {
            addCriterion("Fabulous is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousEqualTo(Long value) {
            addCriterion("Fabulous =", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotEqualTo(Long value) {
            addCriterion("Fabulous <>", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThan(Long value) {
            addCriterion("Fabulous >", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThanOrEqualTo(Long value) {
            addCriterion("Fabulous >=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThan(Long value) {
            addCriterion("Fabulous <", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThanOrEqualTo(Long value) {
            addCriterion("Fabulous <=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousIn(List<Long> values) {
            addCriterion("Fabulous in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotIn(List<Long> values) {
            addCriterion("Fabulous not in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousBetween(Long value1, Long value2) {
            addCriterion("Fabulous between", value1, value2, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotBetween(Long value1, Long value2) {
            addCriterion("Fabulous not between", value1, value2, "fabulous");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNull() {
            addCriterion("CommentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("CommentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Long value) {
            addCriterion("CommentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Long value) {
            addCriterion("CommentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Long value) {
            addCriterion("CommentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Long value) {
            addCriterion("CommentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Long value) {
            addCriterion("CommentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Long value) {
            addCriterion("CommentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Long> values) {
            addCriterion("CommentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Long> values) {
            addCriterion("CommentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Long value1, Long value2) {
            addCriterion("CommentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Long value1, Long value2) {
            addCriterion("CommentId not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidIsNull() {
            addCriterion("ReplyCommentId is null");
            return (Criteria) this;
        }

        public Criteria andReplycommentidIsNotNull() {
            addCriterion("ReplyCommentId is not null");
            return (Criteria) this;
        }

        public Criteria andReplycommentidEqualTo(Long value) {
            addCriterion("ReplyCommentId =", value, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidNotEqualTo(Long value) {
            addCriterion("ReplyCommentId <>", value, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidGreaterThan(Long value) {
            addCriterion("ReplyCommentId >", value, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidGreaterThanOrEqualTo(Long value) {
            addCriterion("ReplyCommentId >=", value, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidLessThan(Long value) {
            addCriterion("ReplyCommentId <", value, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidLessThanOrEqualTo(Long value) {
            addCriterion("ReplyCommentId <=", value, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidIn(List<Long> values) {
            addCriterion("ReplyCommentId in", values, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidNotIn(List<Long> values) {
            addCriterion("ReplyCommentId not in", values, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidBetween(Long value1, Long value2) {
            addCriterion("ReplyCommentId between", value1, value2, "replycommentid");
            return (Criteria) this;
        }

        public Criteria andReplycommentidNotBetween(Long value1, Long value2) {
            addCriterion("ReplyCommentId not between", value1, value2, "replycommentid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table trackcomment
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
     * This class corresponds to the database table trackcomment
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