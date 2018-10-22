package com.wyy.pattern.proxy.jdkProxy;

import java.lang.reflect.Proxy;

public class UserDaoInvokerProxy {

    public static <T> T getInstance(Class<?> cls){
        UserDaoInvocationHandler invocationHandler = new UserDaoInvocationHandler();
        Object newProxyInstance = Proxy.newProxyInstance(
                cls.getClassLoader(),
                new Class[] { cls },
                invocationHandler);
        return (T)newProxyInstance;
    }
}