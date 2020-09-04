package com.ljq.aopdiy;


import org.springframework.stereotype.Component;

@Component
public class diyaop {
    public void before(){
        System.out.println("方法执行前======");
    }
    public void after(){
        System.out.println("方法执行后======");
    }
}
