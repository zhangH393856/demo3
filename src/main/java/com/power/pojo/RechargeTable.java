package com.power.pojo;

public class RechargeTable {
    private Integer id;

    private Integer rechargeCount;

    private String rechargeTime;

    private String rechargeUsername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRechargeCount() {
        return rechargeCount;
    }

    public void setRechargeCount(Integer rechargeCount) {
        this.rechargeCount = rechargeCount;
    }

    public String getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime == null ? null : rechargeTime.trim();
    }

    public String getRechargeUsername() {
        return rechargeUsername;
    }

    public void setRechargeUsername(String rechargeUsername) {
        this.rechargeUsername = rechargeUsername == null ? null : rechargeUsername.trim();
    }
}