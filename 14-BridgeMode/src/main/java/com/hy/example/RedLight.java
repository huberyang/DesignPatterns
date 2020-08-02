package com.hy.example;

/**
 * author: hubery yang
 * date: 8/2/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class RedLight implements Light {

    @Override
    public void turnOn() {
        System.out.println("turn on the red light");
    }
}
