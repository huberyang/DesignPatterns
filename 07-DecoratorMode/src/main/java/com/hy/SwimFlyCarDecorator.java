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
public class SwimFlyCarDecorator extends CarDecorator {

    public SwimFlyCarDecorator(Car car) {
        super(car);
    }

    public void swim(){
        System.out.println("can swim");
    }

    @Override
    public void decorate() {
        this.getCar().functionDisplay();
        this.swim();
    }
}
