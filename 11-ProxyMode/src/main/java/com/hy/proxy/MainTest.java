package com.hy.proxy;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Subject subject =new ConcreteSubject();
        ProxySubject proxy=new ProxySubject(subject);
        proxy.sellBook();
    }
}
