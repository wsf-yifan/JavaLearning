package com.yifan.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController{
    @GetMapping("/testapi")
    public String test(){
        System.out.println("Test route invoked!");
        return "test api";
    }

}