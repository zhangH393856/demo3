package com.power.pojo;

public class GiftTable {
    private Integer giftId;

    private String giftTitle;

    private Integer gift200;

    private Integer gift500;

    private Integer gift800;

    private Integer gift1000;

    private Integer gift1500;

    private Integer gift2000;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftTitle() {
        return giftTitle;
    }

    public void setGiftTitle(String giftTitle) {
        this.giftTitle = giftTitle == null ? null : giftTitle.trim();
    }

    public Integer getGift200() {
        return gift200;
    }

    public void setGift200(Integer gift200) {
        this.gift200 = gift200;
    }

    public Integer getGift500() {
        return gift500;
    }

    public void setGift500(Integer gift500) {
        this.gift500 = gift500;
    }

    public Integer getGift800() {
        return gift800;
    }

    public void setGift800(Integer gift800) {
        this.gift800 = gift800;
    }

    public Integer getGift1000() {
        return gift1000;
    }

    public void setGift1000(Integer gift1000) {
        this.gift1000 = gift1000;
    }

    public Integer getGift1500() {
        return gift1500;
    }

    public void setGift1500(Integer gift1500) {
        this.gift1500 = gift1500;
    }

    public Integer getGift2000() {
        return gift2000;
    }

    public void setGift2000(Integer gift2000) {
        this.gift2000 = gift2000;
    }
}