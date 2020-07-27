package com.hy.singleton.hungrymode;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Dog {
    //thread safety
    private static final Dog dog =new Dog();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Dog getDog(){
        return dog;
    }
}
