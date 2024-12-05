package com.ayshriv.welcomeapi.rest;

import com.ayshriv.welcomeapi.feign.FeignClintGreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @Autowired
    private FeignClintGreet feignClintGre;

    @GetMapping("/welcome")
    public String welcome() {
        String greet = feignClintGre.greet();
        return greet + " Welcome to Welcome API";
    }
}
