package com.hy.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hubery yang
 * date: 7/28/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {

    public static void main(String[] args) {
        /*Dog dog = new Dog();
        dog.setName("wang cai");
        dog.setAge(3);

        Dog dog2= dog.clone();
        System.out.println(dog.getName());
        System.out.println(dog2.getName());*/

        Dog dog = new Dog();
        dog.setName("wang cai");
        dog.setAge(3);

        List<String> toys =new ArrayList<>();
        toys.add("Ball");
        toys.add("Wooden stick");
        dog.setToys(toys);

        Dog dog2= dog.clone();

        dog.getToys().add("Water");

        System.out.println(dog.getToys());
        System.out.println(dog2.getToys());
    }

}
