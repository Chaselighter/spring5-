package com.ljq.proxy;

import com.ljq.dao.UserDaoMysqlImpl;
import com.ljq.service.UserService;
import com.ljq.service.UserServiceImpl;

public class Client {

    public static void main(String[] args){
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.getUser(1,1);
    }
}
