package com.ljq.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component
public class LogBefore implements MethodBeforeAdvice {
    //要执行的方法method
    //objects参数
    //o 目标对象

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"执行了");
    }
}
