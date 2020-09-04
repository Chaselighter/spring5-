package com.ljq.proxy;

import com.ljq.dao.UserDaoMysqlImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);


    }
    //处理代理实力并返回结果

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是通过反射实现
        Object result = method.invoke(target, args);
        return result;

    }
}
