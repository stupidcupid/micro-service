package com.microservice.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloService {

    @Autowired
    private RestTemplate resttemplate;


    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService() {

        String url = "http://eureka-provider/hello";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);
    }


    public String helloFallBack() {

        return "error";
    }

}
