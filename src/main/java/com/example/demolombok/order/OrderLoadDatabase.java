package com.example.demolombok.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
class OrderLoadDatabase {

    @Bean
    CommandLineRunner initOrderDatabase(OrderRepository repository){
        return args -> {
            repository.save(new Order("MacBook Pro", "COMPLETED"));
            repository.save(new Order("IPhone", "IN_PROGRESS"));

            repository.findAll().forEach(order -> {
                log.info("Order Preloaded " + order);
            });
        };
    }
}
