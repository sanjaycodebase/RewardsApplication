package com.example.RewardsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.RewardsApplication")
public class RewardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RewardsApplication.class, args);
    }
}
