package com.power.pojo;

import java.util.ArrayList;
import java.util.List;

public class FoodTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodTableExample() {
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

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("food_name =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("food_name >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("food_name <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("food_name like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("food_name not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("food_name in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodCostIsNull() {
            addCriterion("food_cost is null");
            return (Criteria) this;
        }

        public Criteria andFoodCostIsNotNull() {
            addCriterion("food_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFoodCostEqualTo(Double value) {
            addCriterion("food_cost =", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostNotEqualTo(Double value) {
            addCriterion("food_cost <>", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostGreaterThan(Double value) {
            addCriterion("food_cost >", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostGreaterThanOrEqualTo(Double value) {
            addCriterion("food_cost >=", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostLessThan(Double value) {
            addCriterion("food_cost <", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostLessThanOrEqualTo(Double value) {
            addCriterion("food_cost <=", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostIn(List<Double> values) {
            addCriterion("food_cost in", values, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostNotIn(List<Double> values) {
            addCriterion("food_cost not in", values, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostBetween(Double value1, Double value2) {
            addCriterion("food_cost between", value1, value2, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostNotBetween(Double value1, Double value2) {
            addCriterion("food_cost not between", value1, value2, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodFileIsNull() {
            addCriterion("food_file is null");
            return (Criteria) this;
        }

        public Criteria andFoodFileIsNotNull() {
            addCriterion("food_file is not null");
            return (Criteria) this;
        }

        public Criteria andFoodFileEqualTo(String value) {
            addCriterion("food_file =", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileNotEqualTo(String value) {
            addCriterion("food_file <>", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileGreaterThan(String value) {
            addCriterion("food_file >", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileGreaterThanOrEqualTo(String value) {
            addCriterion("food_file >=", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileLessThan(String value) {
            addCriterion("food_file <", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileLessThanOrEqualTo(String value) {
            addCriterion("food_file <=", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileLike(String value) {
            addCriterion("food_file like", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileNotLike(String value) {
            addCriterion("food_file not like", value, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileIn(List<String> values) {
            addCriterion("food_file in", values, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileNotIn(List<String> values) {
            addCriterion("food_file not in", values, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileBetween(String value1, String value2) {
            addCriterion("food_file between", value1, value2, "foodFile");
            return (Criteria) this;
        }

        public Criteria andFoodFileNotBetween(String value1, String value2) {
            addCriterion("food_file not between", value1, value2, "foodFile");
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