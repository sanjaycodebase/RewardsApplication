package com.example.RewardsApplication.model;

public class Reward {

    private String customerId;
    private int points;
    private String month;

    // Getters and Setters

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getMonth() {
        return month;
    }

    // Add the missing setter method for month
    public void setMonth(String month) {
        this.month = month;
    }
}
