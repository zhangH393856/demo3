package com.power.pojo;

import java.util.Date;

public class VipsTable {
    private Integer vipId;

    private String vipUsername;

    private String vipPhone;

    private Integer vipState;

    private Date vipStarttime;

    private Date vipEndtime;

    private String vipStarttimestring;

    private String vipEndtimestring;

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public String getVipUsername() {
        return vipUsername;
    }

    public void setVipUsername(String vipUsername) {
        this.vipUsername = vipUsername == null ? null : vipUsername.trim();
    }

    public String getVipPhone() {
        return vipPhone;
    }

    public void setVipPhone(String vipPhone) {
        this.vipPhone = vipPhone == null ? null : vipPhone.trim();
    }

    public Integer getVipState() {
        return vipState;
    }

    public void setVipState(Integer vipState) {
        this.vipState = vipState;
    }

    public Date getVipStarttime() {
        return vipStarttime;
    }

    public void setVipStarttime(Date vipStarttime) {
        this.vipStarttime = vipStarttime;
    }

    public Date getVipEndtime() {
        return vipEndtime;
    }

    public void setVipEndtime(Date vipEndtime) {
        this.vipEndtime = vipEndtime;
    }

    public String getVipStarttimestring() {
        return vipStarttimestring;
    }

    public void setVipStarttimestring(String vipStarttimestring) {
        this.vipStarttimestring = vipStarttimestring == null ? null : vipStarttimestring.trim();
    }

    public String getVipEndtimestring() {
        return vipEndtimestring;
    }

    public void setVipEndtimestring(String vipEndtimestring) {
        this.vipEndtimestring = vipEndtimestring == null ? null : vipEndtimestring.trim();
    }
}