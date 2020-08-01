package com.hy.example;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Dog extends Animal {

    private String number;

    public Dog(){
        super();
    }

    public Dog(String name, String age,String number) {
        super(name, age);
        this.number=number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
