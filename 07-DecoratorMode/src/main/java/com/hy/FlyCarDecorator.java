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
public class FlyCarDecorator extends CarDecorator{

    public FlyCarDecorator(Car car) {
        super(car);
    }

    public void fly(){
        System.out.println("can fly");
    }

    @Override
    public void decorate() {
       this.getCar().functionDisplay();
       this.fly();
    }

    @Override
    public void run() {

    }

    @Override
    public void functionDisplay() {
        this.decorate();
    }
}
