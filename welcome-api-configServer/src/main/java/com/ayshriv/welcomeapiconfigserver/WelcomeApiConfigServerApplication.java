package com.ayshriv.welcomeapiconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class WelcomeApiConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeApiConfigServerApplication.class, args);
    }

}
