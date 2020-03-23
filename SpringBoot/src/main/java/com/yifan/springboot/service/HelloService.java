package com.yifan.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService{
    public String sayHello(){
        return "Hello World";
    }
}