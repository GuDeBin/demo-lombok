package com.example.demolombok.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
class OrderController {

    private final OrderRepository repository;

    OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    List<Order> all() {
        return repository.findAll();
    }
}
