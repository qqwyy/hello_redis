package com.wyy.pattern.proxy.rpcProxy;

import java.lang.reflect.InvocationHandler;


//https://www.cnblogs.com/clonen/p/6735011.html
public class LocalClient {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        Integer port = 8001;
        Class<?> classType = Service.class;
        InvocationHandler h = new ServiceInvocationHandler(classType, host, port);
        Service serviceProxy = (Service) RemoteServiceProxyFactory.getRemoteServiceProxy(h);
        String result = serviceProxy.getService("SunnyMarkLiu", 22);
        System.out.println("调用远程方法getService的结果：" + result);
    }
}