package com.yifan.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseHelloService{
    @Autowired
    HelloService helloService;

    public String sayHello(){
        return helloService.sayHello();
    }
}