package com.unibta.PMIII.controllers;

import com.unibta.PMIII.enums.OrderStatus;
import com.unibta.PMIII.models.Order;
import com.unibta.PMIII.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<Order> create(@RequestBody Order order) {

        order.setId(UUID.randomUUID());
        order.setOrderDate(new Date());
        order.setOrderStatus(OrderStatus.ORDERED);

        orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getAll());
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<Order> getOne(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getById(id));
    }

    @PutMapping("/order")
    public ResponseEntity<Order> update(@RequestBody Order card) {
        orderService.createOrder(card);
        return ResponseEntity.status(HttpStatus.CREATED).body(card);
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<Order> deleteOne(@PathVariable UUID id) {
        orderService.deleteOrderById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/order/mobile")
    public ResponseEntity<OrderDtoMobile> getAllData() {
        OrderDtoMobile order = new OrderDtoMobile(orderService.getAll());
        return ResponseEntity.status(HttpStatus.OK).body(order);
    }
}
