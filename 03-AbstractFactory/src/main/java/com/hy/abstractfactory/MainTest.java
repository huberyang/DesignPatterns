package com.hy.abstractfactory;


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
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        AbstractFactory af = FactoryCreator.createFactory("com.hy.abstractfactory.animal.AnimalFactory");
        af.createAnimal("com.hy.abstractfactory.animal.Dog").voice();

        AbstractFactory af2= FactoryCreator.createFactory("com.hy.abstractfactory.plant.PlantFactory");
        af2.createPlant("com.hy.abstractfactory.plant.Flower").color();
    }
}
