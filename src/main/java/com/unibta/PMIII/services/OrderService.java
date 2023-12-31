package com.unibta.PMIII.services;

import com.unibta.PMIII.enums.OrderStatus;
import com.unibta.PMIII.models.Order;
import com.unibta.PMIII.models.User;
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

    @Autowired
    UserService userService;

    public void createOrder(Order order) {
        if (order.getBuyerName() == null || order.getBuyerPhone() == null) {
           User user = userService.getById(order.getBuyerId());
           if (user != null) {
               order.setBuyerName(user.getName());
               order.setBuyerPhone(user.getPhone());
           }
        }

        orderRepository.save(order);
    }

    public List<Order> getAll() {
        if (orderRepository.findAll().isEmpty()) {
            createOrder(new Order(UUID.randomUUID(), new Date(), "Marcos", 25.00, OrderStatus.DONE, "(21)987875548", 1L));
            createOrder(new Order(UUID.randomUUID(), new Date(), "João", 25.00, OrderStatus.PENDING, "(27)987556484", 2L));
            createOrder(new Order(UUID.randomUUID(), new Date(), "Carlos", 25.00, OrderStatus.ORDERED, "(84)998754814", 3L));
        }
        return orderRepository.findAll();
    }

    public Order getById(UUID id) {
        return orderRepository.findById(id).orElse(null);
    }

    public void deleteOrderById(UUID id) {
        orderRepository.deleteById(id);
    }

    public List<Order> getAllByBuyerId(Long buyerId) {
        return orderRepository.findByBuyerId(buyerId);
    }
}
