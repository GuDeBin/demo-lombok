package com.example.demolombok.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository){
        this.repository = repository;
    }

    @GetMapping("/all")
    List<Employee> all(){
        return repository.findAll();
    }
}
