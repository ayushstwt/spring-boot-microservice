package com.ayshriv.greetapiconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class GreetApiConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetApiConfigServerApplication.class, args);
    }

}
