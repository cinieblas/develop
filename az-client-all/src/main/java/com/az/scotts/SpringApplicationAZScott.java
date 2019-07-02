package com.az.scotts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class SpringApplicationAZScott implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationAZScott.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
    }
}
