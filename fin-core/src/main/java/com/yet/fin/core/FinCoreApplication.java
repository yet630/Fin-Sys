package com.yet.fin.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FinCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinCoreApplication.class, args);
    }

}
