package com.hy.state;

/**
 * author: hubery yang
 * date: 8/5/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.setTime(18);
        dog.behavior();

        dog.setTime(7);
        dog.behavior();

        dog.setTime(12);
        dog.behavior();

        dog.setTime(723);
        dog.behavior();
    }
}
