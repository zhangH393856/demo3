package com.power.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VipsTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipsTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andVipIdIsNull() {
            addCriterion("vip_id is null");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNotNull() {
            addCriterion("vip_id is not null");
            return (Criteria) this;
        }

        public Criteria andVipIdEqualTo(Integer value) {
            addCriterion("vip_id =", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotEqualTo(Integer value) {
            addCriterion("vip_id <>", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThan(Integer value) {
            addCriterion("vip_id >", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_id >=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThan(Integer value) {
            addCriterion("vip_id <", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThanOrEqualTo(Integer value) {
            addCriterion("vip_id <=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdIn(List<Integer> values) {
            addCriterion("vip_id in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotIn(List<Integer> values) {
            addCriterion("vip_id not in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdBetween(Integer value1, Integer value2) {
            addCriterion("vip_id between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_id not between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipUsernameIsNull() {
            addCriterion("vip_username is null");
            return (Criteria) this;
        }

        public Criteria andVipUsernameIsNotNull() {
            addCriterion("vip_username is not null");
            return (Criteria) this;
        }

        public Criteria andVipUsernameEqualTo(String value) {
            addCriterion("vip_username =", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameNotEqualTo(String value) {
            addCriterion("vip_username <>", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameGreaterThan(String value) {
            addCriterion("vip_username >", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("vip_username >=", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameLessThan(String value) {
            addCriterion("vip_username <", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameLessThanOrEqualTo(String value) {
            addCriterion("vip_username <=", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameLike(String value) {
            addCriterion("vip_username like", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameNotLike(String value) {
            addCriterion("vip_username not like", value, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameIn(List<String> values) {
            addCriterion("vip_username in", values, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameNotIn(List<String> values) {
            addCriterion("vip_username not in", values, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameBetween(String value1, String value2) {
            addCriterion("vip_username between", value1, value2, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipUsernameNotBetween(String value1, String value2) {
            addCriterion("vip_username not between", value1, value2, "vipUsername");
            return (Criteria) this;
        }

        public Criteria andVipPhoneIsNull() {
            addCriterion("vip_phone is null");
            return (Criteria) this;
        }

        public Criteria andVipPhoneIsNotNull() {
            addCriterion("vip_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVipPhoneEqualTo(String value) {
            addCriterion("vip_phone =", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotEqualTo(String value) {
            addCriterion("vip_phone <>", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneGreaterThan(String value) {
            addCriterion("vip_phone >", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("vip_phone >=", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneLessThan(String value) {
            addCriterion("vip_phone <", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneLessThanOrEqualTo(String value) {
            addCriterion("vip_phone <=", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneLike(String value) {
            addCriterion("vip_phone like", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotLike(String value) {
            addCriterion("vip_phone not like", value, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneIn(List<String> values) {
            addCriterion("vip_phone in", values, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotIn(List<String> values) {
            addCriterion("vip_phone not in", values, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneBetween(String value1, String value2) {
            addCriterion("vip_phone between", value1, value2, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipPhoneNotBetween(String value1, String value2) {
            addCriterion("vip_phone not between", value1, value2, "vipPhone");
            return (Criteria) this;
        }

        public Criteria andVipStateIsNull() {
            addCriterion("vip_state is null");
            return (Criteria) this;
        }

        public Criteria andVipStateIsNotNull() {
            addCriterion("vip_state is not null");
            return (Criteria) this;
        }

        public Criteria andVipStateEqualTo(Integer value) {
            addCriterion("vip_state =", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotEqualTo(Integer value) {
            addCriterion("vip_state <>", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateGreaterThan(Integer value) {
            addCriterion("vip_state >", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_state >=", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateLessThan(Integer value) {
            addCriterion("vip_state <", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateLessThanOrEqualTo(Integer value) {
            addCriterion("vip_state <=", value, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateIn(List<Integer> values) {
            addCriterion("vip_state in", values, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotIn(List<Integer> values) {
            addCriterion("vip_state not in", values, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateBetween(Integer value1, Integer value2) {
            addCriterion("vip_state between", value1, value2, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStateNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_state not between", value1, value2, "vipState");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeIsNull() {
            addCriterion("vip_starttime is null");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeIsNotNull() {
            addCriterion("vip_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeEqualTo(Date value) {
            addCriterion("vip_starttime =", value, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeNotEqualTo(Date value) {
            addCriterion("vip_starttime <>", value, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeGreaterThan(Date value) {
            addCriterion("vip_starttime >", value, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vip_starttime >=", value, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeLessThan(Date value) {
            addCriterion("vip_starttime <", value, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("vip_starttime <=", value, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeIn(List<Date> values) {
            addCriterion("vip_starttime in", values, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeNotIn(List<Date> values) {
            addCriterion("vip_starttime not in", values, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeBetween(Date value1, Date value2) {
            addCriterion("vip_starttime between", value1, value2, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("vip_starttime not between", value1, value2, "vipStarttime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeIsNull() {
            addCriterion("vip_endtime is null");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeIsNotNull() {
            addCriterion("vip_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeEqualTo(Date value) {
            addCriterion("vip_endtime =", value, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeNotEqualTo(Date value) {
            addCriterion("vip_endtime <>", value, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeGreaterThan(Date value) {
            addCriterion("vip_endtime >", value, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vip_endtime >=", value, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeLessThan(Date value) {
            addCriterion("vip_endtime <", value, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("vip_endtime <=", value, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeIn(List<Date> values) {
            addCriterion("vip_endtime in", values, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeNotIn(List<Date> values) {
            addCriterion("vip_endtime not in", values, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeBetween(Date value1, Date value2) {
            addCriterion("vip_endtime between", value1, value2, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("vip_endtime not between", value1, value2, "vipEndtime");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringIsNull() {
            addCriterion("vip_starttimestring is null");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringIsNotNull() {
            addCriterion("vip_starttimestring is not null");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringEqualTo(String value) {
            addCriterion("vip_starttimestring =", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringNotEqualTo(String value) {
            addCriterion("vip_starttimestring <>", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringGreaterThan(String value) {
            addCriterion("vip_starttimestring >", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringGreaterThanOrEqualTo(String value) {
            addCriterion("vip_starttimestring >=", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringLessThan(String value) {
            addCriterion("vip_starttimestring <", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringLessThanOrEqualTo(String value) {
            addCriterion("vip_starttimestring <=", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringLike(String value) {
            addCriterion("vip_starttimestring like", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringNotLike(String value) {
            addCriterion("vip_starttimestring not like", value, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringIn(List<String> values) {
            addCriterion("vip_starttimestring in", values, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringNotIn(List<String> values) {
            addCriterion("vip_starttimestring not in", values, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringBetween(String value1, String value2) {
            addCriterion("vip_starttimestring between", value1, value2, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipStarttimestringNotBetween(String value1, String value2) {
            addCriterion("vip_starttimestring not between", value1, value2, "vipStarttimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringIsNull() {
            addCriterion("vip_endtimestring is null");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringIsNotNull() {
            addCriterion("vip_endtimestring is not null");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringEqualTo(String value) {
            addCriterion("vip_endtimestring =", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringNotEqualTo(String value) {
            addCriterion("vip_endtimestring <>", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringGreaterThan(String value) {
            addCriterion("vip_endtimestring >", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringGreaterThanOrEqualTo(String value) {
            addCriterion("vip_endtimestring >=", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringLessThan(String value) {
            addCriterion("vip_endtimestring <", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringLessThanOrEqualTo(String value) {
            addCriterion("vip_endtimestring <=", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringLike(String value) {
            addCriterion("vip_endtimestring like", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringNotLike(String value) {
            addCriterion("vip_endtimestring not like", value, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringIn(List<String> values) {
            addCriterion("vip_endtimestring in", values, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringNotIn(List<String> values) {
            addCriterion("vip_endtimestring not in", values, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringBetween(String value1, String value2) {
            addCriterion("vip_endtimestring between", value1, value2, "vipEndtimestring");
            return (Criteria) this;
        }

        public Criteria andVipEndtimestringNotBetween(String value1, String value2) {
            addCriterion("vip_endtimestring not between", value1, value2, "vipEndtimestring");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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