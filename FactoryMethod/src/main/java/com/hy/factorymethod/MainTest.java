package com.hy.factorymethod;

/**
 * author: hubery yang
 * date: 7/23/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        //多态
        AnimalFactory df =new DogFactory();
        df.createAnimal().voice();

        AnimalFactory cf = new CatFactory();
        cf.createAnimal().voice();
    }
}
