package com.yifan.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "测试用的Hello controller", tags="USED FOR TEST")
public class HelloController{
    @ApiOperation("hello测试")
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Again.";
    }

    @ApiOperation("hi测试")
    @GetMapping("/hi")
    public String hi(){
        return "Hi Spring Again.";
    }
}