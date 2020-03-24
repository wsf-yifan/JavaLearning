package com.yifan.springboot.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yifan.springboot.aop")
@EnableAspectJAutoProxy // 开启spring对aspectj的支持
public class AopConfig{


}