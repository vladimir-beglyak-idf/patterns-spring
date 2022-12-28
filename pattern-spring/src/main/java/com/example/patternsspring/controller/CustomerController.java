package com.example.patternsspring.controller;

import com.example.patternsspring.model.Customer;
import com.example.patternsspring.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @PostMapping
    public Mono<Void> create(@RequestBody Publisher<Customer> customerFlux) {
        return customerRepository.saveAll(customerFlux).then();
    }

    @GetMapping
    public Flux<Customer> list() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Customer> findById(@PathVariable Long id) {
        return customerRepository.findById(id);
    }
}
