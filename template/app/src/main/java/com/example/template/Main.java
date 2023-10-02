package com.example.template;

import com.example.template.config.DataAccessConfiguration;
import com.example.template.config.DomainAppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

@EntityScan
@SpringBootApplication
@Import({ DataAccessConfiguration.class, DomainAppConfiguration.class })
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}