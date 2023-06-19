package com.unibta.PMIII.services;

import com.unibta.PMIII.enums.OrderStatus;
import com.unibta.PMIII.models.Order;
import com.unibta.PMIII.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> getAll() {
        if (orderRepository.findAll().isEmpty()) {
            createOrder(new Order(UUID.randomUUID(), new Date(), "Marcos", 25.00, OrderStatus.DONE, "(21)987875548"));
            createOrder(new Order(UUID.randomUUID(), new Date(), "João", 25.00, OrderStatus.PENDING, "(27)987556484"));
            createOrder(new Order(UUID.randomUUID(), new Date(), "Carlos", 25.00, OrderStatus.ORDERED, "(84)998754814"));
        }
        return orderRepository.findAll();
    }

    public Order getById(UUID id) {
        return orderRepository.findById(id).orElse(null);
    }

    public void deleteOrderById(UUID id) {
        orderRepository.deleteById(id);
    }

}
