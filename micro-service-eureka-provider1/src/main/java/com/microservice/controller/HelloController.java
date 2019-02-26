package com.microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayhello() {

        return "i`m provider1,hello consumer! my port is " + port;
    }


}
