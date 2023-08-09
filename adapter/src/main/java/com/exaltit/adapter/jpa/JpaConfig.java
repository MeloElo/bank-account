package com.exaltit.adapter.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.exaltit.adapter.jpa")
@EnableJpaRepositories("com.exaltit.adapter.jpa")
public class JpaConfig {


}
