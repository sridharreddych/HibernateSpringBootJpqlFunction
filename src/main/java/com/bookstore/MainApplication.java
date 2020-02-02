package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println(bookstoreService.fetchBookByIsbn());
        };
    }

}
/*
 * 
 * 
 * How To Execute SQL Functions In WHERE Part Of JPQL Query And JPA 2.1

Note: Using SQL functions in SELECT part (not in WHERE part) of the query can be done as here.

Description: Starting with JPA 2.1, a JPQL query can call SQL functions in the WHERE part via function(). This application is an example of calling the MySQL, concat_ws function, but user defined (custom) functions can be used as well.

Key points:

use JPA 2.1, function()

 */
