package com.power.pojo;

public class EnergyTable {
    private Integer energyId;

    private Integer energyPrice;

    private String energyUsername;

    private String energyType;

    private String energyState;

    private String energyTime;

    private Integer energyYearmonth;

    private Integer energyRealmoney;

    private Integer energyCount;

    public Integer getEnergyId() {
        return energyId;
    }

    public void setEnergyId(Integer energyId) {
        this.energyId = energyId;
    }

    public Integer getEnergyPrice() {
        return energyPrice;
    }

    public void setEnergyPrice(Integer energyPrice) {
        this.energyPrice = energyPrice;
    }

    public String getEnergyUsername() {
        return energyUsername;
    }

    public void setEnergyUsername(String energyUsername) {
        this.energyUsername = energyUsername == null ? null : energyUsername.trim();
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType == null ? null : energyType.trim();
    }

    public String getEnergyState() {
        return energyState;
    }

    public void setEnergyState(String energyState) {
        this.energyState = energyState == null ? null : energyState.trim();
    }

    public String getEnergyTime() {
        return energyTime;
    }

    public void setEnergyTime(String energyTime) {
        this.energyTime = energyTime == null ? null : energyTime.trim();
    }

    public Integer getEnergyYearmonth() {
        return energyYearmonth;
    }

    public void setEnergyYearmonth(Integer energyYearmonth) {
        this.energyYearmonth = energyYearmonth;
    }

    public Integer getEnergyRealmoney() {
        return energyRealmoney;
    }

    public void setEnergyRealmoney(Integer energyRealmoney) {
        this.energyRealmoney = energyRealmoney;
    }

    public Integer getEnergyCount() {
        return energyCount;
    }

    public void setEnergyCount(Integer energyCount) {
        this.energyCount = energyCount;
    }
}