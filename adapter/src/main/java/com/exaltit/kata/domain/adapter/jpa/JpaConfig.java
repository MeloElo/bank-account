package com.exaltit.kata.domain.adapter.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.exaltit.kata.domain.adapter.jpa")
@EnableJpaRepositories("com.exaltit.kata.domain.adapter.jpa")
public class JpaConfig {


}
