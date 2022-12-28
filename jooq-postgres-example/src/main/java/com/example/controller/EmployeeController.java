package com.example.controller;

import com.example.model.EmployeeInfo;
import com.example.model.Gender;
import com.example.repository.DefaultEmployeeRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.pojos.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/jooq/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final DefaultEmployeeRepository employeeRepository;

    @GetMapping("/{id}")
    public Mono<Employee> getEmployee(@PathVariable("id") Long id) {
        return employeeRepository.findById(id);
    }

    @GetMapping("gender/{type}")
    public Flux<Employee> findByGender(@PathVariable("type") String gender) {
        Gender type = Gender.of(gender);
        return employeeRepository.findByGender(type);
    }

    @GetMapping("name/{name}")
    public Flux<Employee> findByName(@PathVariable("name") String name) {
        return employeeRepository.findByName(name);
    }

    @GetMapping
    public Flux<EmployeeInfo> getAll() {
        return employeeRepository.findAll();
    }
}
