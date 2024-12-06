package com.ayshriv.welcomeapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-API")
public interface FeignClintGreet {

    @GetMapping("/greet")
    public String greet();
}
