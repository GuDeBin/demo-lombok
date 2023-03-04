package com.example.demolombok.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
