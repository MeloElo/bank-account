package com.exaltit.kata.domain.adapter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages= {"com.exaltit.kata"})
@EnableSwagger2
@OpenAPIDefinition(
                info = @Info(title = "Rest bank account",
                version = "1.0", description = "Documentation de l'api de bank account"))
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}