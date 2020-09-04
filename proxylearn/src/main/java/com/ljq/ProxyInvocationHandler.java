package com.ljq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;
    public void setRent(Rent rent){
        this.rent=rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);


    }
    //处理代理实力并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是通过反射实现
        Object result = method.invoke(rent, args);
        return result;

    }
}