package com.wyy.pattern.proxy.rpcProxy;

/**
 * Service接口。代理类和被代理类抖需要实现该接口
 */
public interface Service {
    public String getService(String name, int number);
}