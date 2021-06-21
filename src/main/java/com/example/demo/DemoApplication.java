package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

/*
    @Bean
    ApplicationRunner init(BillionariesRepository repository) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                repository.save(new Billionarie(i, "name_"+i, "last_"+i, "career_"+i));
            }
        };
    }

 */
}
