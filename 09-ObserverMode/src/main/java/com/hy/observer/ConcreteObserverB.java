package com.hy.observer;


/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ConcreteObserverB implements Observer {

    @Override
    public void notice() {
        System.out.println("Concrete Observer B got it");
    }
}
