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
public class MainTest {
    public static void main(String[] args) {
        Light redLight = new RedLight();
        Light yellowLight = new YellowLight();

        Switch sw=new LivingRoomSwitch(redLight);

        sw.turnOn();
    }
}
