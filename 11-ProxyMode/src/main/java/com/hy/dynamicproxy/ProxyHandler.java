package com.hy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ProxyHandler implements InvocationHandler {

    private Subject subject;

    public ProxyHandler(Subject subject){
        this.subject=subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =null;
        discount();
        result = method.invoke(subject, args);
        giveSmallGift();
        return result;
    }

    public void discount(){
        System.out.println("50% Off");
    }

    public void giveSmallGift(){
        System.out.println("Give a small gift");
    }
}
