package com.ayshriv.greetapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @GetMapping("/greet")
    public String getGreeting() {
        return "Hello World";
    }
}
