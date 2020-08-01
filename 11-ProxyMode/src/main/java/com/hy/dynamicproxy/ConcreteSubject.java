package com.hy.dynamicproxy;


/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ConcreteSubject implements Subject {

    @Override
    public void sellBook() {
        System.out.println("Sell Book");
    }
}
