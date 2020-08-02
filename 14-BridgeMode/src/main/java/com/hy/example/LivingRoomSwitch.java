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
public class LivingRoomSwitch extends Switch {

    public LivingRoomSwitch(Light light) {
        super(light);
    }

    @Override
    public void turnOn() {
        System.out.print("LivingRoomSwitch: ");
        this.getLight().turnOn();
    }
}
