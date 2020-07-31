package com.hy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {

        //定义观察者
        Observer observerA =new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        //定义被观察者
        ConcreteSubject subject=new ConcreteSubject();
        subject.registerObserver(observerA);
        subject.registerObserver(observerB);

        subject.publish();


    }
}
