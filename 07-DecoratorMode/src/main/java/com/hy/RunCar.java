package com.hy;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class RunCar implements Car {
    @Override
    public void run() {
        System.out.println("can run");
    }

    @Override
    public void functionDisplay() {
        this.run();
    }
}
