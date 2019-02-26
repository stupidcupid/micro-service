package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProvider1Application.class, args);
    }

}
