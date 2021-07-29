package com.power.pojo;

public class FoodTable {
    private Integer foodId;

    private String foodName;

    private Double foodCost;

    private String foodFile;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public Double getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(Double foodCost) {
        this.foodCost = foodCost;
    }

    public String getFoodFile() {
        return foodFile;
    }

    public void setFoodFile(String foodFile) {
        this.foodFile = foodFile == null ? null : foodFile.trim();
    }
}