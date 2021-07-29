package com.power.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderfoodTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderfoodTableExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameIsNull() {
            addCriterion("order_username is null");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameIsNotNull() {
            addCriterion("order_username is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameEqualTo(String value) {
            addCriterion("order_username =", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameNotEqualTo(String value) {
            addCriterion("order_username <>", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameGreaterThan(String value) {
            addCriterion("order_username >", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("order_username >=", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameLessThan(String value) {
            addCriterion("order_username <", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameLessThanOrEqualTo(String value) {
            addCriterion("order_username <=", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameLike(String value) {
            addCriterion("order_username like", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameNotLike(String value) {
            addCriterion("order_username not like", value, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameIn(List<String> values) {
            addCriterion("order_username in", values, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameNotIn(List<String> values) {
            addCriterion("order_username not in", values, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameBetween(String value1, String value2) {
            addCriterion("order_username between", value1, value2, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderUsernameNotBetween(String value1, String value2) {
            addCriterion("order_username not between", value1, value2, "orderUsername");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameIsNull() {
            addCriterion("order_foodname is null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameIsNotNull() {
            addCriterion("order_foodname is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameEqualTo(String value) {
            addCriterion("order_foodname =", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameNotEqualTo(String value) {
            addCriterion("order_foodname <>", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameGreaterThan(String value) {
            addCriterion("order_foodname >", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("order_foodname >=", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameLessThan(String value) {
            addCriterion("order_foodname <", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameLessThanOrEqualTo(String value) {
            addCriterion("order_foodname <=", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameLike(String value) {
            addCriterion("order_foodname like", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameNotLike(String value) {
            addCriterion("order_foodname not like", value, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameIn(List<String> values) {
            addCriterion("order_foodname in", values, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameNotIn(List<String> values) {
            addCriterion("order_foodname not in", values, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameBetween(String value1, String value2) {
            addCriterion("order_foodname between", value1, value2, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodnameNotBetween(String value1, String value2) {
            addCriterion("order_foodname not between", value1, value2, "orderFoodname");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountIsNull() {
            addCriterion("order_foodcount is null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountIsNotNull() {
            addCriterion("order_foodcount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountEqualTo(Integer value) {
            addCriterion("order_foodcount =", value, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountNotEqualTo(Integer value) {
            addCriterion("order_foodcount <>", value, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountGreaterThan(Integer value) {
            addCriterion("order_foodcount >", value, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_foodcount >=", value, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountLessThan(Integer value) {
            addCriterion("order_foodcount <", value, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountLessThanOrEqualTo(Integer value) {
            addCriterion("order_foodcount <=", value, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountIn(List<Integer> values) {
            addCriterion("order_foodcount in", values, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountNotIn(List<Integer> values) {
            addCriterion("order_foodcount not in", values, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountBetween(Integer value1, Integer value2) {
            addCriterion("order_foodcount between", value1, value2, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodcountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_foodcount not between", value1, value2, "orderFoodcount");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceIsNull() {
            addCriterion("order_foodprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceIsNotNull() {
            addCriterion("order_foodprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceEqualTo(Double value) {
            addCriterion("order_foodprice =", value, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceNotEqualTo(Double value) {
            addCriterion("order_foodprice <>", value, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceGreaterThan(Double value) {
            addCriterion("order_foodprice >", value, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_foodprice >=", value, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceLessThan(Double value) {
            addCriterion("order_foodprice <", value, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceLessThanOrEqualTo(Double value) {
            addCriterion("order_foodprice <=", value, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceIn(List<Double> values) {
            addCriterion("order_foodprice in", values, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceNotIn(List<Double> values) {
            addCriterion("order_foodprice not in", values, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceBetween(Double value1, Double value2) {
            addCriterion("order_foodprice between", value1, value2, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderFoodpriceNotBetween(Double value1, Double value2) {
            addCriterion("order_foodprice not between", value1, value2, "orderFoodprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceIsNull() {
            addCriterion("order_oneprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceIsNotNull() {
            addCriterion("order_oneprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceEqualTo(Double value) {
            addCriterion("order_oneprice =", value, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceNotEqualTo(Double value) {
            addCriterion("order_oneprice <>", value, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceGreaterThan(Double value) {
            addCriterion("order_oneprice >", value, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_oneprice >=", value, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceLessThan(Double value) {
            addCriterion("order_oneprice <", value, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceLessThanOrEqualTo(Double value) {
            addCriterion("order_oneprice <=", value, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceIn(List<Double> values) {
            addCriterion("order_oneprice in", values, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceNotIn(List<Double> values) {
            addCriterion("order_oneprice not in", values, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceBetween(Double value1, Double value2) {
            addCriterion("order_oneprice between", value1, value2, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderOnepriceNotBetween(Double value1, Double value2) {
            addCriterion("order_oneprice not between", value1, value2, "orderOneprice");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateIsNull() {
            addCriterion("order_adminstate is null");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateIsNotNull() {
            addCriterion("order_adminstate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateEqualTo(Integer value) {
            addCriterion("order_adminstate =", value, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateNotEqualTo(Integer value) {
            addCriterion("order_adminstate <>", value, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateGreaterThan(Integer value) {
            addCriterion("order_adminstate >", value, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_adminstate >=", value, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateLessThan(Integer value) {
            addCriterion("order_adminstate <", value, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateLessThanOrEqualTo(Integer value) {
            addCriterion("order_adminstate <=", value, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateIn(List<Integer> values) {
            addCriterion("order_adminstate in", values, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateNotIn(List<Integer> values) {
            addCriterion("order_adminstate not in", values, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateBetween(Integer value1, Integer value2) {
            addCriterion("order_adminstate between", value1, value2, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderAdminstateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_adminstate not between", value1, value2, "orderAdminstate");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeIsNull() {
            addCriterion("order_starttime is null");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeIsNotNull() {
            addCriterion("order_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeEqualTo(String value) {
            addCriterion("order_starttime =", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeNotEqualTo(String value) {
            addCriterion("order_starttime <>", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeGreaterThan(String value) {
            addCriterion("order_starttime >", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_starttime >=", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeLessThan(String value) {
            addCriterion("order_starttime <", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeLessThanOrEqualTo(String value) {
            addCriterion("order_starttime <=", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeLike(String value) {
            addCriterion("order_starttime like", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeNotLike(String value) {
            addCriterion("order_starttime not like", value, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeIn(List<String> values) {
            addCriterion("order_starttime in", values, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeNotIn(List<String> values) {
            addCriterion("order_starttime not in", values, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeBetween(String value1, String value2) {
            addCriterion("order_starttime between", value1, value2, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderStarttimeNotBetween(String value1, String value2) {
            addCriterion("order_starttime not between", value1, value2, "orderStarttime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeIsNull() {
            addCriterion("order_endtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeIsNotNull() {
            addCriterion("order_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeEqualTo(String value) {
            addCriterion("order_endtime =", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeNotEqualTo(String value) {
            addCriterion("order_endtime <>", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeGreaterThan(String value) {
            addCriterion("order_endtime >", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_endtime >=", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeLessThan(String value) {
            addCriterion("order_endtime <", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeLessThanOrEqualTo(String value) {
            addCriterion("order_endtime <=", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeLike(String value) {
            addCriterion("order_endtime like", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeNotLike(String value) {
            addCriterion("order_endtime not like", value, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeIn(List<String> values) {
            addCriterion("order_endtime in", values, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeNotIn(List<String> values) {
            addCriterion("order_endtime not in", values, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeBetween(String value1, String value2) {
            addCriterion("order_endtime between", value1, value2, "orderEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderEndtimeNotBetween(String value1, String value2) {
            addCriterion("order_endtime not between", value1, value2, "orderEndtime");
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