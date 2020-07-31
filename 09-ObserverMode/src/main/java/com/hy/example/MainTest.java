package com.hy.example;

import java.util.Observable;
import java.util.Observer;

/**
 * author: hubery yang
 * date: 7/30/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {

    public static void main(String[] args) {
        Observer observerA =new SubscriberA();
        Observer observerB =new SubscriberB();

        Youtuber liziqi=new Youtuber();
        liziqi.addObserver(observerA);
        liziqi.addObserver(observerB);

        liziqi.publish("The life of peanut","Different ways to eat peanuts");
    }
}
