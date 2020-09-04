package com.ljq;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args){
        Host host = new Host();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(host);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
