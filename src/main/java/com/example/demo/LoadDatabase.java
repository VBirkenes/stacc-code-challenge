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
            log.info("Preloading " + repository.save(new Customer("NK-2JsQ3Xh7VjadTbHQtfwcbp","Person", "Thomas BLOMQVIST", "Blomqvist Thomas;Thomas Blomqvist", "1965-01-15", "fi", "", "Q5579704", "", "+35894323008", "thomas.blomqvist@eduskunta.fi", "CIA World Leaders;Every Politician", "2021-07-26 11:55:45", "2021-10-07 03:02:59")));
            log.info("Preloading " + repository.save(new Customer("evpo-ff10bc5a-4aad-4895-b886-fb88e598ed57","Person", "Knut Arild Hareide", "Hareide, Knut Arild", "1972-11-23", "no", "", "Q1350399", "", "", "", "Every Politician", "2021-07-26 11:55:45", "2021-10-07 03:02:59")));
            log.info("Preloading " + repository.save(new Customer("evpo-64239edf-8e06-4d2d-acc0-33d96bc79774","Person", "Joe Biden", "Baiden Džo;Biden, Joseph", "1942-11-20", "us", "", "Q6279", "", "", "", "Every Politician", "2021-07-26 11:55:45", "2021-10-07 03:02:59")));
        };
    }
    
}
