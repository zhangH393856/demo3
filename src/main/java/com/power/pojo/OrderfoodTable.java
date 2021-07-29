package com.power.pojo;

public class OrderfoodTable {
    private Integer orderId;

    private String orderUsername;

    private String orderFoodname;

    private Integer orderFoodcount;

    private Double orderFoodprice;

    private Double orderOneprice;

    private Integer orderState;

    private Integer orderAdminstate;

    private String orderStarttime;

    private String orderEndtime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderUsername() {
        return orderUsername;
    }

    public void setOrderUsername(String orderUsername) {
        this.orderUsername = orderUsername == null ? null : orderUsername.trim();
    }

    public String getOrderFoodname() {
        return orderFoodname;
    }

    public void setOrderFoodname(String orderFoodname) {
        this.orderFoodname = orderFoodname == null ? null : orderFoodname.trim();
    }

    public Integer getOrderFoodcount() {
        return orderFoodcount;
    }

    public void setOrderFoodcount(Integer orderFoodcount) {
        this.orderFoodcount = orderFoodcount;
    }

    public Double getOrderFoodprice() {
        return orderFoodprice;
    }

    public void setOrderFoodprice(Double orderFoodprice) {
        this.orderFoodprice = orderFoodprice;
    }

    public Double getOrderOneprice() {
        return orderOneprice;
    }

    public void setOrderOneprice(Double orderOneprice) {
        this.orderOneprice = orderOneprice;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getOrderAdminstate() {
        return orderAdminstate;
    }

    public void setOrderAdminstate(Integer orderAdminstate) {
        this.orderAdminstate = orderAdminstate;
    }

    public String getOrderStarttime() {
        return orderStarttime;
    }

    public void setOrderStarttime(String orderStarttime) {
        this.orderStarttime = orderStarttime == null ? null : orderStarttime.trim();
    }

    public String getOrderEndtime() {
        return orderEndtime;
    }

    public void setOrderEndtime(String orderEndtime) {
        this.orderEndtime = orderEndtime == null ? null : orderEndtime.trim();
    }
}