package com.exaltit.kata.domain.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.exaltit.kata.*"})
public class Main {

    public static void main(String[] args) {
          SpringApplication.run(Main.class, args);
    }

}