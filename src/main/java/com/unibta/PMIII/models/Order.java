package com.unibta.PMIII.models;

import com.unibta.PMIII.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    private UUID id;
    private Date orderDate;
    private String buyerName;
    private Double orderValue;
    private OrderStatus orderStatus;
    private String buyerPhone;

    public Order() {
    }

    public Order(UUID id, Date orderDate, String buyerName, Double orderValue, OrderStatus orderStatus, String buyerPhone) {
        this.id = id;
        this.orderDate = orderDate;
        this.buyerName = buyerName;
        this.orderValue = orderValue;
        this.orderStatus = orderStatus;
        this.buyerPhone = buyerPhone;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Double orderValue) {
        this.orderValue = orderValue;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }
}
