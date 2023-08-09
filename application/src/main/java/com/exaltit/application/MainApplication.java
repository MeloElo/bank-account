package com.exaltit.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages= {"com.exaltit.*"}, exclude = {R2dbcAutoConfiguration.class})
@EnableConfigurationProperties
public class MainApplication {

    public static void main(String[] args) {
          SpringApplication.run(MainApplication.class, args);
    }

}