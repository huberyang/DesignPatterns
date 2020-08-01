package com.hy.flyweight;

/**
 * author: hubery yang
 * date: 7/31/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        ConcreteFlyWeight a = factory.getFlyWeight('a');
        ConcreteFlyWeight b = factory.getFlyWeight('b');
        ConcreteFlyWeight c = factory.getFlyWeight('c');

        ConcreteFlyWeight d = factory.getFlyWeight('a');

        System.out.println(a==b);
        System.out.println(a==d);

    }
}
