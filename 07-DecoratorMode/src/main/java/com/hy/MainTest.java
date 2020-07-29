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
public class MainTest {
    public static void main(String[] args) {
        //创建普通实体
        Car car =new RunCar();

        //创建装饰器
        CarDecorator flyCar=new FlyCarDecorator(car);
        flyCar.decorate();


        System.out.println("----------------------");
        //创建装饰器，在已有装饰的情况下再进行装饰
        CarDecorator swimFlyCar =new SwimFlyCarDecorator(flyCar);
        swimFlyCar.decorate();
    }
}
