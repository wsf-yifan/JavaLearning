package com.yifan.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 不加报错：No qualifying bean of type 'com.yifan.springboot.service.UseHelloService' available
@ComponentScan("com.yifan.springboot.service")
public class DiConfig{

}