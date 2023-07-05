package com.exaltit.kata.domain.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

@SpringBootApplication(scanBasePackages= {"com.exaltit.kata.*"}, exclude = {R2dbcAutoConfiguration.class})
public class Main {

    public static void main(String[] args) {
          SpringApplication.run(Main.class, args);
    }

}