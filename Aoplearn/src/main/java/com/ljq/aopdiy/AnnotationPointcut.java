package com.ljq.aopdiy;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect//标注为一个切面
@Component
public class AnnotationPointcut {
    @Before("execution(* com.ljq.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("--------方法执行前======");
    }
    @After("execution(* com.ljq.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("-----------方法执行后======");
    }
}
