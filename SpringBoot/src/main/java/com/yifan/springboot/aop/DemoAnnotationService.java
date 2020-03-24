package com.yifan.springboot.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService{
    @Action(name="注解式拦截")
    public void add(){
        System.out.println("注解式拦截方法add执行内容。");
    }
}