package com.hy.staticfactory;

/**
 * author: hubery yang
 * date: 7/23/2020
 * description:
 * title: Dog
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Dog implements Animal {

    @Override
    public void voice(){
        System.out.println("WangWang...");
    }
}
