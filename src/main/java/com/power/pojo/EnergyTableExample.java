package com.power.pojo;

import java.util.ArrayList;
import java.util.List;

public class EnergyTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnergyTableExample() {
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

        public Criteria andEnergyIdIsNull() {
            addCriterion("energy_id is null");
            return (Criteria) this;
        }

        public Criteria andEnergyIdIsNotNull() {
            addCriterion("energy_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyIdEqualTo(Integer value) {
            addCriterion("energy_id =", value, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdNotEqualTo(Integer value) {
            addCriterion("energy_id <>", value, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdGreaterThan(Integer value) {
            addCriterion("energy_id >", value, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy_id >=", value, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdLessThan(Integer value) {
            addCriterion("energy_id <", value, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdLessThanOrEqualTo(Integer value) {
            addCriterion("energy_id <=", value, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdIn(List<Integer> values) {
            addCriterion("energy_id in", values, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdNotIn(List<Integer> values) {
            addCriterion("energy_id not in", values, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdBetween(Integer value1, Integer value2) {
            addCriterion("energy_id between", value1, value2, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("energy_id not between", value1, value2, "energyId");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceIsNull() {
            addCriterion("energy_price is null");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceIsNotNull() {
            addCriterion("energy_price is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceEqualTo(Integer value) {
            addCriterion("energy_price =", value, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceNotEqualTo(Integer value) {
            addCriterion("energy_price <>", value, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceGreaterThan(Integer value) {
            addCriterion("energy_price >", value, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy_price >=", value, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceLessThan(Integer value) {
            addCriterion("energy_price <", value, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceLessThanOrEqualTo(Integer value) {
            addCriterion("energy_price <=", value, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceIn(List<Integer> values) {
            addCriterion("energy_price in", values, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceNotIn(List<Integer> values) {
            addCriterion("energy_price not in", values, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceBetween(Integer value1, Integer value2) {
            addCriterion("energy_price between", value1, value2, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("energy_price not between", value1, value2, "energyPrice");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameIsNull() {
            addCriterion("energy_userName is null");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameIsNotNull() {
            addCriterion("energy_userName is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameEqualTo(String value) {
            addCriterion("energy_userName =", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameNotEqualTo(String value) {
            addCriterion("energy_userName <>", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameGreaterThan(String value) {
            addCriterion("energy_userName >", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("energy_userName >=", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameLessThan(String value) {
            addCriterion("energy_userName <", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameLessThanOrEqualTo(String value) {
            addCriterion("energy_userName <=", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameLike(String value) {
            addCriterion("energy_userName like", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameNotLike(String value) {
            addCriterion("energy_userName not like", value, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameIn(List<String> values) {
            addCriterion("energy_userName in", values, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameNotIn(List<String> values) {
            addCriterion("energy_userName not in", values, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameBetween(String value1, String value2) {
            addCriterion("energy_userName between", value1, value2, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyUsernameNotBetween(String value1, String value2) {
            addCriterion("energy_userName not between", value1, value2, "energyUsername");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeIsNull() {
            addCriterion("energy_type is null");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeIsNotNull() {
            addCriterion("energy_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeEqualTo(String value) {
            addCriterion("energy_type =", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeNotEqualTo(String value) {
            addCriterion("energy_type <>", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeGreaterThan(String value) {
            addCriterion("energy_type >", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("energy_type >=", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeLessThan(String value) {
            addCriterion("energy_type <", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeLessThanOrEqualTo(String value) {
            addCriterion("energy_type <=", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeLike(String value) {
            addCriterion("energy_type like", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeNotLike(String value) {
            addCriterion("energy_type not like", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeIn(List<String> values) {
            addCriterion("energy_type in", values, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeNotIn(List<String> values) {
            addCriterion("energy_type not in", values, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeBetween(String value1, String value2) {
            addCriterion("energy_type between", value1, value2, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeNotBetween(String value1, String value2) {
            addCriterion("energy_type not between", value1, value2, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyStateIsNull() {
            addCriterion("energy_state is null");
            return (Criteria) this;
        }

        public Criteria andEnergyStateIsNotNull() {
            addCriterion("energy_state is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyStateEqualTo(String value) {
            addCriterion("energy_state =", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateNotEqualTo(String value) {
            addCriterion("energy_state <>", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateGreaterThan(String value) {
            addCriterion("energy_state >", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateGreaterThanOrEqualTo(String value) {
            addCriterion("energy_state >=", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateLessThan(String value) {
            addCriterion("energy_state <", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateLessThanOrEqualTo(String value) {
            addCriterion("energy_state <=", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateLike(String value) {
            addCriterion("energy_state like", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateNotLike(String value) {
            addCriterion("energy_state not like", value, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateIn(List<String> values) {
            addCriterion("energy_state in", values, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateNotIn(List<String> values) {
            addCriterion("energy_state not in", values, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateBetween(String value1, String value2) {
            addCriterion("energy_state between", value1, value2, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyStateNotBetween(String value1, String value2) {
            addCriterion("energy_state not between", value1, value2, "energyState");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeIsNull() {
            addCriterion("energy_time is null");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeIsNotNull() {
            addCriterion("energy_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeEqualTo(String value) {
            addCriterion("energy_time =", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeNotEqualTo(String value) {
            addCriterion("energy_time <>", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeGreaterThan(String value) {
            addCriterion("energy_time >", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("energy_time >=", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeLessThan(String value) {
            addCriterion("energy_time <", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeLessThanOrEqualTo(String value) {
            addCriterion("energy_time <=", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeLike(String value) {
            addCriterion("energy_time like", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeNotLike(String value) {
            addCriterion("energy_time not like", value, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeIn(List<String> values) {
            addCriterion("energy_time in", values, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeNotIn(List<String> values) {
            addCriterion("energy_time not in", values, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeBetween(String value1, String value2) {
            addCriterion("energy_time between", value1, value2, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyTimeNotBetween(String value1, String value2) {
            addCriterion("energy_time not between", value1, value2, "energyTime");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthIsNull() {
            addCriterion("energy_yearmonth is null");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthIsNotNull() {
            addCriterion("energy_yearmonth is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthEqualTo(Integer value) {
            addCriterion("energy_yearmonth =", value, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthNotEqualTo(Integer value) {
            addCriterion("energy_yearmonth <>", value, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthGreaterThan(Integer value) {
            addCriterion("energy_yearmonth >", value, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy_yearmonth >=", value, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthLessThan(Integer value) {
            addCriterion("energy_yearmonth <", value, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthLessThanOrEqualTo(Integer value) {
            addCriterion("energy_yearmonth <=", value, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthIn(List<Integer> values) {
            addCriterion("energy_yearmonth in", values, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthNotIn(List<Integer> values) {
            addCriterion("energy_yearmonth not in", values, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthBetween(Integer value1, Integer value2) {
            addCriterion("energy_yearmonth between", value1, value2, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyYearmonthNotBetween(Integer value1, Integer value2) {
            addCriterion("energy_yearmonth not between", value1, value2, "energyYearmonth");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyIsNull() {
            addCriterion("energy_realMoney is null");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyIsNotNull() {
            addCriterion("energy_realMoney is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyEqualTo(Integer value) {
            addCriterion("energy_realMoney =", value, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyNotEqualTo(Integer value) {
            addCriterion("energy_realMoney <>", value, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyGreaterThan(Integer value) {
            addCriterion("energy_realMoney >", value, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy_realMoney >=", value, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyLessThan(Integer value) {
            addCriterion("energy_realMoney <", value, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("energy_realMoney <=", value, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyIn(List<Integer> values) {
            addCriterion("energy_realMoney in", values, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyNotIn(List<Integer> values) {
            addCriterion("energy_realMoney not in", values, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyBetween(Integer value1, Integer value2) {
            addCriterion("energy_realMoney between", value1, value2, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyRealmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("energy_realMoney not between", value1, value2, "energyRealmoney");
            return (Criteria) this;
        }

        public Criteria andEnergyCountIsNull() {
            addCriterion("energy_count is null");
            return (Criteria) this;
        }

        public Criteria andEnergyCountIsNotNull() {
            addCriterion("energy_count is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyCountEqualTo(Integer value) {
            addCriterion("energy_count =", value, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountNotEqualTo(Integer value) {
            addCriterion("energy_count <>", value, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountGreaterThan(Integer value) {
            addCriterion("energy_count >", value, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy_count >=", value, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountLessThan(Integer value) {
            addCriterion("energy_count <", value, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountLessThanOrEqualTo(Integer value) {
            addCriterion("energy_count <=", value, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountIn(List<Integer> values) {
            addCriterion("energy_count in", values, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountNotIn(List<Integer> values) {
            addCriterion("energy_count not in", values, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountBetween(Integer value1, Integer value2) {
            addCriterion("energy_count between", value1, value2, "energyCount");
            return (Criteria) this;
        }

        public Criteria andEnergyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("energy_count not between", value1, value2, "energyCount");
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