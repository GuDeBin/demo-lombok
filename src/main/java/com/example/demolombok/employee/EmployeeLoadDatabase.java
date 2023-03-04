package com.example.demolombok.employee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
class EmployeeLoadDatabase {

    @Bean
    CommandLineRunner initEmployeeDatabase(EmployeeRepository repository){
        return args -> {
            log.info("Employee Preloading " + repository.save(new Employee("Bilbo", "burglar")));
            log.info("Employee Preloading " + repository.save(new Employee("Frodo", "thief")));
        };
    }
}
