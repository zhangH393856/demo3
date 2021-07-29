package com.power.pojo;

public class UserTable1 {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userPhone;

    private String userBuilding;

    private String userUnit;

    private String userRoom;

    private String userState;

    private String userIntime;

    private String userOuttime;

    private Integer userBalance;

    private Integer userCount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserBuilding() {
        return userBuilding;
    }

    public void setUserBuilding(String userBuilding) {
        this.userBuilding = userBuilding == null ? null : userBuilding.trim();
    }

    public String getUserUnit() {
        return userUnit;
    }

    public void setUserUnit(String userUnit) {
        this.userUnit = userUnit == null ? null : userUnit.trim();
    }

    public String getUserRoom() {
        return userRoom;
    }

    public void setUserRoom(String userRoom) {
        this.userRoom = userRoom == null ? null : userRoom.trim();
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState == null ? null : userState.trim();
    }

    public String getUserIntime() {
        return userIntime;
    }

    public void setUserIntime(String userIntime) {
        this.userIntime = userIntime == null ? null : userIntime.trim();
    }

    public String getUserOuttime() {
        return userOuttime;
    }

    public void setUserOuttime(String userOuttime) {
        this.userOuttime = userOuttime == null ? null : userOuttime.trim();
    }

    public Integer getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Integer userBalance) {
        this.userBalance = userBalance;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }
}