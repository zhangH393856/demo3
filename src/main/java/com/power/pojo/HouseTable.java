package com.power.pojo;

public class HouseTable {
    private Integer id;

    private String unitId;

    private String roomId;

    private String staticName;

    private String userName;

    private Integer userConsumption;

    private String userIntime;

    private String userOuttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getStaticName() {
        return staticName;
    }

    public void setStaticName(String staticName) {
        this.staticName = staticName == null ? null : staticName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserConsumption() {
        return userConsumption;
    }

    public void setUserConsumption(Integer userConsumption) {
        this.userConsumption = userConsumption;
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
}