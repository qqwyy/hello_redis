package com.wyy.pattern.proxy.jdkProxy;

import java.lang.reflect.Proxy;

public class UserDaoProxyInstance {

    public Object getInstance(Class<?> cls){
        UserDaoInvocationHandler invocationHandler = new UserDaoInvocationHandler();
        Object newProxyInstance = Proxy.newProxyInstance(
                cls.getClassLoader(),
                new Class[] { cls },
                invocationHandler);
        return (Object)newProxyInstance;
    }
}