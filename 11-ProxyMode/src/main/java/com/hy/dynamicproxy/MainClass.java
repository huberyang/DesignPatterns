package com.hy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainClass {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        InvocationHandler handler=new ProxyHandler(subject);
        //根据反射自动生成代理类
        Subject proxy = (Subject) Proxy.newProxyInstance(ConcreteSubject.class.getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.sellBook();

    }
}
