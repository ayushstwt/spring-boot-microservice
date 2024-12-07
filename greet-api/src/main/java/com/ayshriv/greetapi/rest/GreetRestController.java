package com.ayshriv.greetapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @Autowired
    Environment environment;

    @GetMapping("/greet")
    public String getGreeting() {
        String property = environment.getProperty("server.port");
        return "Good Evening"+ property;
    }
}
