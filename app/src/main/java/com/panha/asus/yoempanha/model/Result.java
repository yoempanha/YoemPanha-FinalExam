package com.panha.asus.yoempanha.model;

import java.util.List;

public class Result {
    private List<Order> orderList;
    private Profile profile;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
