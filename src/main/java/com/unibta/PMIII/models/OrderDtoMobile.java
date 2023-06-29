package com.unibta.PMIII.models;

import com.unibta.PMIII.models.Order;

import java.util.List;

public class OrderDtoMobile {
    List<Order> orderList;

    public OrderDtoMobile() {
    }

    public OrderDtoMobile(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
