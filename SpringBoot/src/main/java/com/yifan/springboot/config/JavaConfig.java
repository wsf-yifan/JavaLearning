package com.yifan.springboot.config;

import com.yifan.springboot.service.FunctionService;
import com.yifan.springboot.service.UseFunctionService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    //TODO: Bean need to have a none para constructor 20200323?
    @Bean
    public UseFunctionService useFunctionService() {
        final UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
}
