package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Customer("NK-23wLbkLretoJxTci3VMZwE","Person", "Joe Biden", "Baiden Džo", "1942-11-20", "us", "", "Q6279", "", "", "", "Every Politician", "2021-07-26 11:55:45", "2021-10-07 03:02:59")));
        };
    }
    
}
