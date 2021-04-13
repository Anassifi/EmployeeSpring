package com.anassifi.spring.database;

import com.anassifi.spring.entities.Employee;
import com.anassifi.spring.repositories.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return args -> {
            log.info("Preloading " + employeeRepository.save(new Employee("Hakime", "WebDev")));
            log.info("Preloading " + employeeRepository.save(new Employee("Rochdi", "WebDev")));

            log.info("Loading all employees using FindAll()");
            log.info("Loading ------------------------------");
            log.info("All employees : " + employeeRepository.findAll());
        };
    }
}
