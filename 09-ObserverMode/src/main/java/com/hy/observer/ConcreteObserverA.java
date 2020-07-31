package com.hy.observer;

import java.util.Observable;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void notice() {
        System.out.println("Concrete Observer A got it");
    }
}
