package com.microservice.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {

        String context = "Hello " + new Date();
        System.out.println("Sender: " + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }
}
