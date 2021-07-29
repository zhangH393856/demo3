package com.power.pojo;

import java.util.ArrayList;
import java.util.List;

public class ViptypeTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViptypeTableExample() {
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

        public Criteria andViptypeIdIsNull() {
            addCriterion("viptype_id is null");
            return (Criteria) this;
        }

        public Criteria andViptypeIdIsNotNull() {
            addCriterion("viptype_id is not null");
            return (Criteria) this;
        }

        public Criteria andViptypeIdEqualTo(Integer value) {
            addCriterion("viptype_id =", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotEqualTo(Integer value) {
            addCriterion("viptype_id <>", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdGreaterThan(Integer value) {
            addCriterion("viptype_id >", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("viptype_id >=", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdLessThan(Integer value) {
            addCriterion("viptype_id <", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("viptype_id <=", value, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdIn(List<Integer> values) {
            addCriterion("viptype_id in", values, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotIn(List<Integer> values) {
            addCriterion("viptype_id not in", values, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdBetween(Integer value1, Integer value2) {
            addCriterion("viptype_id between", value1, value2, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("viptype_id not between", value1, value2, "viptypeId");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceIsNull() {
            addCriterion("viptype1_price is null");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceIsNotNull() {
            addCriterion("viptype1_price is not null");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceEqualTo(Integer value) {
            addCriterion("viptype1_price =", value, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceNotEqualTo(Integer value) {
            addCriterion("viptype1_price <>", value, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceGreaterThan(Integer value) {
            addCriterion("viptype1_price >", value, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("viptype1_price >=", value, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceLessThan(Integer value) {
            addCriterion("viptype1_price <", value, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceLessThanOrEqualTo(Integer value) {
            addCriterion("viptype1_price <=", value, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceIn(List<Integer> values) {
            addCriterion("viptype1_price in", values, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceNotIn(List<Integer> values) {
            addCriterion("viptype1_price not in", values, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceBetween(Integer value1, Integer value2) {
            addCriterion("viptype1_price between", value1, value2, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype1PriceNotBetween(Integer value1, Integer value2) {
            addCriterion("viptype1_price not between", value1, value2, "viptype1Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceIsNull() {
            addCriterion("viptype2_price is null");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceIsNotNull() {
            addCriterion("viptype2_price is not null");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceEqualTo(Integer value) {
            addCriterion("viptype2_price =", value, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceNotEqualTo(Integer value) {
            addCriterion("viptype2_price <>", value, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceGreaterThan(Integer value) {
            addCriterion("viptype2_price >", value, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("viptype2_price >=", value, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceLessThan(Integer value) {
            addCriterion("viptype2_price <", value, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceLessThanOrEqualTo(Integer value) {
            addCriterion("viptype2_price <=", value, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceIn(List<Integer> values) {
            addCriterion("viptype2_price in", values, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceNotIn(List<Integer> values) {
            addCriterion("viptype2_price not in", values, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceBetween(Integer value1, Integer value2) {
            addCriterion("viptype2_price between", value1, value2, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype2PriceNotBetween(Integer value1, Integer value2) {
            addCriterion("viptype2_price not between", value1, value2, "viptype2Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceIsNull() {
            addCriterion("viptype3_price is null");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceIsNotNull() {
            addCriterion("viptype3_price is not null");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceEqualTo(Integer value) {
            addCriterion("viptype3_price =", value, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceNotEqualTo(Integer value) {
            addCriterion("viptype3_price <>", value, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceGreaterThan(Integer value) {
            addCriterion("viptype3_price >", value, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("viptype3_price >=", value, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceLessThan(Integer value) {
            addCriterion("viptype3_price <", value, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceLessThanOrEqualTo(Integer value) {
            addCriterion("viptype3_price <=", value, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceIn(List<Integer> values) {
            addCriterion("viptype3_price in", values, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceNotIn(List<Integer> values) {
            addCriterion("viptype3_price not in", values, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceBetween(Integer value1, Integer value2) {
            addCriterion("viptype3_price between", value1, value2, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype3PriceNotBetween(Integer value1, Integer value2) {
            addCriterion("viptype3_price not between", value1, value2, "viptype3Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceIsNull() {
            addCriterion("viptype4_price is null");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceIsNotNull() {
            addCriterion("viptype4_price is not null");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceEqualTo(Integer value) {
            addCriterion("viptype4_price =", value, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceNotEqualTo(Integer value) {
            addCriterion("viptype4_price <>", value, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceGreaterThan(Integer value) {
            addCriterion("viptype4_price >", value, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("viptype4_price >=", value, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceLessThan(Integer value) {
            addCriterion("viptype4_price <", value, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceLessThanOrEqualTo(Integer value) {
            addCriterion("viptype4_price <=", value, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceIn(List<Integer> values) {
            addCriterion("viptype4_price in", values, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceNotIn(List<Integer> values) {
            addCriterion("viptype4_price not in", values, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceBetween(Integer value1, Integer value2) {
            addCriterion("viptype4_price between", value1, value2, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andViptype4PriceNotBetween(Integer value1, Integer value2) {
            addCriterion("viptype4_price not between", value1, value2, "viptype4Price");
            return (Criteria) this;
        }

        public Criteria andDiscount1IsNull() {
            addCriterion("discount1 is null");
            return (Criteria) this;
        }

        public Criteria andDiscount1IsNotNull() {
            addCriterion("discount1 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount1EqualTo(Integer value) {
            addCriterion("discount1 =", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1NotEqualTo(Integer value) {
            addCriterion("discount1 <>", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1GreaterThan(Integer value) {
            addCriterion("discount1 >", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("discount1 >=", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1LessThan(Integer value) {
            addCriterion("discount1 <", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1LessThanOrEqualTo(Integer value) {
            addCriterion("discount1 <=", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1In(List<Integer> values) {
            addCriterion("discount1 in", values, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1NotIn(List<Integer> values) {
            addCriterion("discount1 not in", values, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1Between(Integer value1, Integer value2) {
            addCriterion("discount1 between", value1, value2, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1NotBetween(Integer value1, Integer value2) {
            addCriterion("discount1 not between", value1, value2, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount2IsNull() {
            addCriterion("discount2 is null");
            return (Criteria) this;
        }

        public Criteria andDiscount2IsNotNull() {
            addCriterion("discount2 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount2EqualTo(Integer value) {
            addCriterion("discount2 =", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2NotEqualTo(Integer value) {
            addCriterion("discount2 <>", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2GreaterThan(Integer value) {
            addCriterion("discount2 >", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("discount2 >=", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2LessThan(Integer value) {
            addCriterion("discount2 <", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2LessThanOrEqualTo(Integer value) {
            addCriterion("discount2 <=", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2In(List<Integer> values) {
            addCriterion("discount2 in", values, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2NotIn(List<Integer> values) {
            addCriterion("discount2 not in", values, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2Between(Integer value1, Integer value2) {
            addCriterion("discount2 between", value1, value2, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2NotBetween(Integer value1, Integer value2) {
            addCriterion("discount2 not between", value1, value2, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount3IsNull() {
            addCriterion("discount3 is null");
            return (Criteria) this;
        }

        public Criteria andDiscount3IsNotNull() {
            addCriterion("discount3 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount3EqualTo(Integer value) {
            addCriterion("discount3 =", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3NotEqualTo(Integer value) {
            addCriterion("discount3 <>", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3GreaterThan(Integer value) {
            addCriterion("discount3 >", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3GreaterThanOrEqualTo(Integer value) {
            addCriterion("discount3 >=", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3LessThan(Integer value) {
            addCriterion("discount3 <", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3LessThanOrEqualTo(Integer value) {
            addCriterion("discount3 <=", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3In(List<Integer> values) {
            addCriterion("discount3 in", values, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3NotIn(List<Integer> values) {
            addCriterion("discount3 not in", values, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3Between(Integer value1, Integer value2) {
            addCriterion("discount3 between", value1, value2, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3NotBetween(Integer value1, Integer value2) {
            addCriterion("discount3 not between", value1, value2, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount4IsNull() {
            addCriterion("discount4 is null");
            return (Criteria) this;
        }

        public Criteria andDiscount4IsNotNull() {
            addCriterion("discount4 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount4EqualTo(Integer value) {
            addCriterion("discount4 =", value, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4NotEqualTo(Integer value) {
            addCriterion("discount4 <>", value, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4GreaterThan(Integer value) {
            addCriterion("discount4 >", value, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4GreaterThanOrEqualTo(Integer value) {
            addCriterion("discount4 >=", value, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4LessThan(Integer value) {
            addCriterion("discount4 <", value, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4LessThanOrEqualTo(Integer value) {
            addCriterion("discount4 <=", value, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4In(List<Integer> values) {
            addCriterion("discount4 in", values, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4NotIn(List<Integer> values) {
            addCriterion("discount4 not in", values, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4Between(Integer value1, Integer value2) {
            addCriterion("discount4 between", value1, value2, "discount4");
            return (Criteria) this;
        }

        public Criteria andDiscount4NotBetween(Integer value1, Integer value2) {
            addCriterion("discount4 not between", value1, value2, "discount4");
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