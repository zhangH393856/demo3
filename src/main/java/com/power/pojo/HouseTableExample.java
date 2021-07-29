package com.power.pojo;

import java.util.ArrayList;
import java.util.List;

public class HouseTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseTableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("unit_id like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("unit_id not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andStaticNameIsNull() {
            addCriterion("static_name is null");
            return (Criteria) this;
        }

        public Criteria andStaticNameIsNotNull() {
            addCriterion("static_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaticNameEqualTo(String value) {
            addCriterion("static_name =", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameNotEqualTo(String value) {
            addCriterion("static_name <>", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameGreaterThan(String value) {
            addCriterion("static_name >", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameGreaterThanOrEqualTo(String value) {
            addCriterion("static_name >=", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameLessThan(String value) {
            addCriterion("static_name <", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameLessThanOrEqualTo(String value) {
            addCriterion("static_name <=", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameLike(String value) {
            addCriterion("static_name like", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameNotLike(String value) {
            addCriterion("static_name not like", value, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameIn(List<String> values) {
            addCriterion("static_name in", values, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameNotIn(List<String> values) {
            addCriterion("static_name not in", values, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameBetween(String value1, String value2) {
            addCriterion("static_name between", value1, value2, "staticName");
            return (Criteria) this;
        }

        public Criteria andStaticNameNotBetween(String value1, String value2) {
            addCriterion("static_name not between", value1, value2, "staticName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionIsNull() {
            addCriterion("user_consumption is null");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionIsNotNull() {
            addCriterion("user_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionEqualTo(Integer value) {
            addCriterion("user_consumption =", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionNotEqualTo(Integer value) {
            addCriterion("user_consumption <>", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionGreaterThan(Integer value) {
            addCriterion("user_consumption >", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_consumption >=", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionLessThan(Integer value) {
            addCriterion("user_consumption <", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionLessThanOrEqualTo(Integer value) {
            addCriterion("user_consumption <=", value, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionIn(List<Integer> values) {
            addCriterion("user_consumption in", values, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionNotIn(List<Integer> values) {
            addCriterion("user_consumption not in", values, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionBetween(Integer value1, Integer value2) {
            addCriterion("user_consumption between", value1, value2, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserConsumptionNotBetween(Integer value1, Integer value2) {
            addCriterion("user_consumption not between", value1, value2, "userConsumption");
            return (Criteria) this;
        }

        public Criteria andUserIntimeIsNull() {
            addCriterion("user_inTime is null");
            return (Criteria) this;
        }

        public Criteria andUserIntimeIsNotNull() {
            addCriterion("user_inTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntimeEqualTo(String value) {
            addCriterion("user_inTime =", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeNotEqualTo(String value) {
            addCriterion("user_inTime <>", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeGreaterThan(String value) {
            addCriterion("user_inTime >", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_inTime >=", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeLessThan(String value) {
            addCriterion("user_inTime <", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeLessThanOrEqualTo(String value) {
            addCriterion("user_inTime <=", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeLike(String value) {
            addCriterion("user_inTime like", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeNotLike(String value) {
            addCriterion("user_inTime not like", value, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeIn(List<String> values) {
            addCriterion("user_inTime in", values, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeNotIn(List<String> values) {
            addCriterion("user_inTime not in", values, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeBetween(String value1, String value2) {
            addCriterion("user_inTime between", value1, value2, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserIntimeNotBetween(String value1, String value2) {
            addCriterion("user_inTime not between", value1, value2, "userIntime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeIsNull() {
            addCriterion("user_outTime is null");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeIsNotNull() {
            addCriterion("user_outTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeEqualTo(String value) {
            addCriterion("user_outTime =", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeNotEqualTo(String value) {
            addCriterion("user_outTime <>", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeGreaterThan(String value) {
            addCriterion("user_outTime >", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_outTime >=", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeLessThan(String value) {
            addCriterion("user_outTime <", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeLessThanOrEqualTo(String value) {
            addCriterion("user_outTime <=", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeLike(String value) {
            addCriterion("user_outTime like", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeNotLike(String value) {
            addCriterion("user_outTime not like", value, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeIn(List<String> values) {
            addCriterion("user_outTime in", values, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeNotIn(List<String> values) {
            addCriterion("user_outTime not in", values, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeBetween(String value1, String value2) {
            addCriterion("user_outTime between", value1, value2, "userOuttime");
            return (Criteria) this;
        }

        public Criteria andUserOuttimeNotBetween(String value1, String value2) {
            addCriterion("user_outTime not between", value1, value2, "userOuttime");
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