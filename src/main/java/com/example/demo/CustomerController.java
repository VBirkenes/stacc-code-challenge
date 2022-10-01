package com.example.demo;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer")
    public Customer getCustomer(@RequestParam String name) {
        return customerRepository.findByName(name);
    }

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) throws URISyntaxException {
        return customerRepository.save(customer);
    }
    
}
