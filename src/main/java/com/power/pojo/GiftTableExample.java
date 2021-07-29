package com.power.pojo;

import java.util.ArrayList;
import java.util.List;

public class GiftTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftTableExample() {
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

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftTitleIsNull() {
            addCriterion("gift_title is null");
            return (Criteria) this;
        }

        public Criteria andGiftTitleIsNotNull() {
            addCriterion("gift_title is not null");
            return (Criteria) this;
        }

        public Criteria andGiftTitleEqualTo(String value) {
            addCriterion("gift_title =", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleNotEqualTo(String value) {
            addCriterion("gift_title <>", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleGreaterThan(String value) {
            addCriterion("gift_title >", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleGreaterThanOrEqualTo(String value) {
            addCriterion("gift_title >=", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleLessThan(String value) {
            addCriterion("gift_title <", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleLessThanOrEqualTo(String value) {
            addCriterion("gift_title <=", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleLike(String value) {
            addCriterion("gift_title like", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleNotLike(String value) {
            addCriterion("gift_title not like", value, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleIn(List<String> values) {
            addCriterion("gift_title in", values, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleNotIn(List<String> values) {
            addCriterion("gift_title not in", values, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleBetween(String value1, String value2) {
            addCriterion("gift_title between", value1, value2, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGiftTitleNotBetween(String value1, String value2) {
            addCriterion("gift_title not between", value1, value2, "giftTitle");
            return (Criteria) this;
        }

        public Criteria andGift200IsNull() {
            addCriterion("gift_200 is null");
            return (Criteria) this;
        }

        public Criteria andGift200IsNotNull() {
            addCriterion("gift_200 is not null");
            return (Criteria) this;
        }

        public Criteria andGift200EqualTo(Integer value) {
            addCriterion("gift_200 =", value, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200NotEqualTo(Integer value) {
            addCriterion("gift_200 <>", value, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200GreaterThan(Integer value) {
            addCriterion("gift_200 >", value, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200GreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_200 >=", value, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200LessThan(Integer value) {
            addCriterion("gift_200 <", value, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200LessThanOrEqualTo(Integer value) {
            addCriterion("gift_200 <=", value, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200In(List<Integer> values) {
            addCriterion("gift_200 in", values, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200NotIn(List<Integer> values) {
            addCriterion("gift_200 not in", values, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200Between(Integer value1, Integer value2) {
            addCriterion("gift_200 between", value1, value2, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift200NotBetween(Integer value1, Integer value2) {
            addCriterion("gift_200 not between", value1, value2, "gift200");
            return (Criteria) this;
        }

        public Criteria andGift500IsNull() {
            addCriterion("gift_500 is null");
            return (Criteria) this;
        }

        public Criteria andGift500IsNotNull() {
            addCriterion("gift_500 is not null");
            return (Criteria) this;
        }

        public Criteria andGift500EqualTo(Integer value) {
            addCriterion("gift_500 =", value, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500NotEqualTo(Integer value) {
            addCriterion("gift_500 <>", value, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500GreaterThan(Integer value) {
            addCriterion("gift_500 >", value, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500GreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_500 >=", value, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500LessThan(Integer value) {
            addCriterion("gift_500 <", value, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500LessThanOrEqualTo(Integer value) {
            addCriterion("gift_500 <=", value, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500In(List<Integer> values) {
            addCriterion("gift_500 in", values, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500NotIn(List<Integer> values) {
            addCriterion("gift_500 not in", values, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500Between(Integer value1, Integer value2) {
            addCriterion("gift_500 between", value1, value2, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift500NotBetween(Integer value1, Integer value2) {
            addCriterion("gift_500 not between", value1, value2, "gift500");
            return (Criteria) this;
        }

        public Criteria andGift800IsNull() {
            addCriterion("gift_800 is null");
            return (Criteria) this;
        }

        public Criteria andGift800IsNotNull() {
            addCriterion("gift_800 is not null");
            return (Criteria) this;
        }

        public Criteria andGift800EqualTo(Integer value) {
            addCriterion("gift_800 =", value, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800NotEqualTo(Integer value) {
            addCriterion("gift_800 <>", value, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800GreaterThan(Integer value) {
            addCriterion("gift_800 >", value, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800GreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_800 >=", value, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800LessThan(Integer value) {
            addCriterion("gift_800 <", value, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800LessThanOrEqualTo(Integer value) {
            addCriterion("gift_800 <=", value, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800In(List<Integer> values) {
            addCriterion("gift_800 in", values, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800NotIn(List<Integer> values) {
            addCriterion("gift_800 not in", values, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800Between(Integer value1, Integer value2) {
            addCriterion("gift_800 between", value1, value2, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift800NotBetween(Integer value1, Integer value2) {
            addCriterion("gift_800 not between", value1, value2, "gift800");
            return (Criteria) this;
        }

        public Criteria andGift1000IsNull() {
            addCriterion("gift_1000 is null");
            return (Criteria) this;
        }

        public Criteria andGift1000IsNotNull() {
            addCriterion("gift_1000 is not null");
            return (Criteria) this;
        }

        public Criteria andGift1000EqualTo(Integer value) {
            addCriterion("gift_1000 =", value, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000NotEqualTo(Integer value) {
            addCriterion("gift_1000 <>", value, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000GreaterThan(Integer value) {
            addCriterion("gift_1000 >", value, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000GreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_1000 >=", value, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000LessThan(Integer value) {
            addCriterion("gift_1000 <", value, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000LessThanOrEqualTo(Integer value) {
            addCriterion("gift_1000 <=", value, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000In(List<Integer> values) {
            addCriterion("gift_1000 in", values, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000NotIn(List<Integer> values) {
            addCriterion("gift_1000 not in", values, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000Between(Integer value1, Integer value2) {
            addCriterion("gift_1000 between", value1, value2, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1000NotBetween(Integer value1, Integer value2) {
            addCriterion("gift_1000 not between", value1, value2, "gift1000");
            return (Criteria) this;
        }

        public Criteria andGift1500IsNull() {
            addCriterion("gift_1500 is null");
            return (Criteria) this;
        }

        public Criteria andGift1500IsNotNull() {
            addCriterion("gift_1500 is not null");
            return (Criteria) this;
        }

        public Criteria andGift1500EqualTo(Integer value) {
            addCriterion("gift_1500 =", value, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500NotEqualTo(Integer value) {
            addCriterion("gift_1500 <>", value, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500GreaterThan(Integer value) {
            addCriterion("gift_1500 >", value, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500GreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_1500 >=", value, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500LessThan(Integer value) {
            addCriterion("gift_1500 <", value, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500LessThanOrEqualTo(Integer value) {
            addCriterion("gift_1500 <=", value, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500In(List<Integer> values) {
            addCriterion("gift_1500 in", values, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500NotIn(List<Integer> values) {
            addCriterion("gift_1500 not in", values, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500Between(Integer value1, Integer value2) {
            addCriterion("gift_1500 between", value1, value2, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift1500NotBetween(Integer value1, Integer value2) {
            addCriterion("gift_1500 not between", value1, value2, "gift1500");
            return (Criteria) this;
        }

        public Criteria andGift2000IsNull() {
            addCriterion("gift_2000 is null");
            return (Criteria) this;
        }

        public Criteria andGift2000IsNotNull() {
            addCriterion("gift_2000 is not null");
            return (Criteria) this;
        }

        public Criteria andGift2000EqualTo(Integer value) {
            addCriterion("gift_2000 =", value, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000NotEqualTo(Integer value) {
            addCriterion("gift_2000 <>", value, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000GreaterThan(Integer value) {
            addCriterion("gift_2000 >", value, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000GreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_2000 >=", value, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000LessThan(Integer value) {
            addCriterion("gift_2000 <", value, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000LessThanOrEqualTo(Integer value) {
            addCriterion("gift_2000 <=", value, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000In(List<Integer> values) {
            addCriterion("gift_2000 in", values, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000NotIn(List<Integer> values) {
            addCriterion("gift_2000 not in", values, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000Between(Integer value1, Integer value2) {
            addCriterion("gift_2000 between", value1, value2, "gift2000");
            return (Criteria) this;
        }

        public Criteria andGift2000NotBetween(Integer value1, Integer value2) {
            addCriterion("gift_2000 not between", value1, value2, "gift2000");
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