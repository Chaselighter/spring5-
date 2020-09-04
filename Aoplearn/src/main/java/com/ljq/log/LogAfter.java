package com.ljq.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class LogAfter implements AfterReturningAdvice {
    //要执行的方法method
    //objects参数
    //target 目标对象
    //result放回结果

    public void afterReturning(Object result, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"执行了"+"，返回结果"+result);
    }


}
