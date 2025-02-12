package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class AccessingDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            // Save some customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));

            // Fetch all customers
            System.out.println("\nCustomers found with findAll():");
            repository.findAll().forEach(customer -> System.out.println(" - " + customer));

            // Fetch an individual customer by ID
            Optional<Customer> customer = repository.findById(1L);
            customer.ifPresentOrElse(
                c -> System.out.println("\nCustomer found with findById(1L): " + c),
                () -> System.out.println("\nCustomer with ID 1 not found.")
            );

            // Fetch customers by last name
            System.out.println("\nCustomers with last name 'Bauer':");
            repository.findByLastName("Bauer").forEach(customerBauer -> System.out.println(" - " + customerBauer));
        };
    }
}
