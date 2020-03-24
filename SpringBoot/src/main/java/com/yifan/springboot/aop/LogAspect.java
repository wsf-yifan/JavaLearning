package com.yifan.springboot.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect // 声明切面
@Component // 注册为spring bean
public class LogAspect {
    @Pointcut("@annotation(com.yifan.springboot.aop.Action)")  // 申明切点
    public void annotationPointCut() {
    }

    @After("annotationPointCut()") // 声明一个建言，使用@Pointcut定义的切点
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.print("注解式拦截： " + action.name()); // 使用反射获取注解属性
    }

    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        System.out.println("方法规则式拦截， " + method.getName());
    }
}