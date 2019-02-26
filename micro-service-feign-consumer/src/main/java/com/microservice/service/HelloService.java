package com.microservice.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-provider")
public interface HelloService {


    @RequestMapping(value = "/hello")
    String hello();

}
