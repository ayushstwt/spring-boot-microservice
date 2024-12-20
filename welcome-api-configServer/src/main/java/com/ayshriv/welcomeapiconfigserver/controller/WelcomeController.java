package com.ayshriv.welcomeapiconfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${msg}")
    public String msg;

    @GetMapping("/welcome")
    public String welcome() {
        return msg;
    }
}
