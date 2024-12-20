package com.ayshriv.greetapiconfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Value("${msg}")
    public String msg;

    @GetMapping("/greet")
    public String greet() {
        return msg;
    }
}
