package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{name}")
    public Customer getCustomer(@PathVariable String name) {
        return customerRepository.findByName(name);
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@RequestBody Customer newCustomer, @PathVariable String id) {
        return customerRepository.findById(id)
            .map(customer -> {
                customer.setSchema(newCustomer.getSchema());
                customer.setName(newCustomer.getName());
                customer.setAliases(newCustomer.getAliases());
                customer.setBirthDate(newCustomer.getBirthDate());
                customer.setCountries(newCustomer.getCountries());
                customer.setAddresses(newCustomer.getAddresses());
                customer.setIdentifiers(newCustomer.getIdentifiers());
                customer.setSanctions(newCustomer.getSanctions());
                customer.setPhones(newCustomer.getPhones());
                customer.setEmails(newCustomer.getEmails());
                customer.setDataset(newCustomer.getDataset());
                customer.setLastSeen(newCustomer.getLastSeen());
                customer.setFirstSeen(newCustomer.getFirstSeen());
                return customerRepository.save(customer);
            }).orElseGet(() -> {
                newCustomer.setId(id);
                return customerRepository.save(newCustomer);
            });
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customerRepository.deleteById(id);
    }
}
