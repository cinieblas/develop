package com.az.scotts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationAZ implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationAZ.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
    }
}
