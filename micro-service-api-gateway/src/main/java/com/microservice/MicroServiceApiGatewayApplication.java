package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class MicroServiceApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceApiGatewayApplication.class, args);
    }

}
