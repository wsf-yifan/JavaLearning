package com.yifan.springboot.service;

public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHi() {
        return functionService.sayHi();
    }
}