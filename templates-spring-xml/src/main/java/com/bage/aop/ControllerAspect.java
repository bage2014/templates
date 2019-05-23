package com.bage.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component // 也要加上
public class ControllerAspect {

    @Pointcut("execution(* *.index())")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("com.bage.aop.ControllerAspect.before() is work");
    }

    @After("com.bage.aop.ControllerAspect.pointcut()")
    public void after(){
        System.out.println("com.bage.aop.ControllerAspect.after() is work");
    }

}
