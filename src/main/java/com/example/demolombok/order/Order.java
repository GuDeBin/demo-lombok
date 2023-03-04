package com.example.demolombok.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_ORDER")
class Order {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String status;

    Order(String description,String status){
        this.description = description;
        this.status = status;
    }
}
