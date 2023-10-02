package com.example.template.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories({"com.example.template.repository"})
@ComponentScan("com.example.template")
public class DataAccessConfiguration {


}
