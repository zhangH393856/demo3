package com.power.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserTable1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTable1Example() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andUserPwdIsNull() {
            addCriterion("user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("user_pwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("user_pwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("user_pwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_pwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("user_pwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("user_pwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("user_pwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("user_pwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("user_pwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("user_pwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("user_pwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("user_pwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserBuildingIsNull() {
            addCriterion("user_building is null");
            return (Criteria) this;
        }

        public Criteria andUserBuildingIsNotNull() {
            addCriterion("user_building is not null");
            return (Criteria) this;
        }

        public Criteria andUserBuildingEqualTo(String value) {
            addCriterion("user_building =", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingNotEqualTo(String value) {
            addCriterion("user_building <>", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingGreaterThan(String value) {
            addCriterion("user_building >", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingGreaterThanOrEqualTo(String value) {
            addCriterion("user_building >=", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingLessThan(String value) {
            addCriterion("user_building <", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingLessThanOrEqualTo(String value) {
            addCriterion("user_building <=", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingLike(String value) {
            addCriterion("user_building like", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingNotLike(String value) {
            addCriterion("user_building not like", value, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingIn(List<String> values) {
            addCriterion("user_building in", values, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingNotIn(List<String> values) {
            addCriterion("user_building not in", values, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingBetween(String value1, String value2) {
            addCriterion("user_building between", value1, value2, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserBuildingNotBetween(String value1, String value2) {
            addCriterion("user_building not between", value1, value2, "userBuilding");
            return (Criteria) this;
        }

        public Criteria andUserUnitIsNull() {
            addCriterion("user_unit is null");
            return (Criteria) this;
        }

        public Criteria andUserUnitIsNotNull() {
            addCriterion("user_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnitEqualTo(String value) {
            addCriterion("user_unit =", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotEqualTo(String value) {
            addCriterion("user_unit <>", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitGreaterThan(String value) {
            addCriterion("user_unit >", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitGreaterThanOrEqualTo(String value) {
            addCriterion("user_unit >=", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLessThan(String value) {
            addCriterion("user_unit <", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLessThanOrEqualTo(String value) {
            addCriterion("user_unit <=", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLike(String value) {
            addCriterion("user_unit like", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotLike(String value) {
            addCriterion("user_unit not like", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitIn(List<String> values) {
            addCriterion("user_unit in", values, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotIn(List<String> values) {
            addCriterion("user_unit not in", values, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitBetween(String value1, String value2) {
            addCriterion("user_unit between", value1, value2, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotBetween(String value1, String value2) {
            addCriterion("user_unit not between", value1, value2, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserRoomIsNull() {
            addCriterion("user_room is null");
            return (Criteria) this;
        }

        public Criteria andUserRoomIsNotNull() {
            addCriterion("user_room is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoomEqualTo(String value) {
            addCriterion("user_room =", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomNotEqualTo(String value) {
            addCriterion("user_room <>", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomGreaterThan(String value) {
            addCriterion("user_room >", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomGreaterThanOrEqualTo(String value) {
            addCriterion("user_room >=", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomLessThan(String value) {
            addCriterion("user_room <", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomLessThanOrEqualTo(String value) {
            addCriterion("user_room <=", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomLike(String value) {
            addCriterion("user_room like", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomNotLike(String value) {
            addCriterion("user_room not like", value, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomIn(List<String> values) {
            addCriterion("user_room in", values, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomNotIn(List<String> values) {
            addCriterion("user_room not in", values, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomBetween(String value1, String value2) {
            addCriterion("user_room between", value1, value2, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserRoomNotBetween(String value1, String value2) {
            addCriterion("user_room not between", value1, value2, "userRoom");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("user_state like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("user_state not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("user_state not between", value1, value2, "userState");
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

        public Criteria andUserBalanceIsNull() {
            addCriterion("user_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNotNull() {
            addCriterion("user_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceEqualTo(Integer value) {
            addCriterion("user_balance =", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotEqualTo(Integer value) {
            addCriterion("user_balance <>", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThan(Integer value) {
            addCriterion("user_balance >", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_balance >=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThan(Integer value) {
            addCriterion("user_balance <", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("user_balance <=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIn(List<Integer> values) {
            addCriterion("user_balance in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotIn(List<Integer> values) {
            addCriterion("user_balance not in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceBetween(Integer value1, Integer value2) {
            addCriterion("user_balance between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("user_balance not between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNull() {
            addCriterion("user_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("user_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(Integer value) {
            addCriterion("user_count =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(Integer value) {
            addCriterion("user_count <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(Integer value) {
            addCriterion("user_count >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_count >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(Integer value) {
            addCriterion("user_count <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_count <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<Integer> values) {
            addCriterion("user_count in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<Integer> values) {
            addCriterion("user_count not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(Integer value1, Integer value2) {
            addCriterion("user_count between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_count not between", value1, value2, "userCount");
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