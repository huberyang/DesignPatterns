package com.hy.factorymethod;

/**
 * author: hubery yang
 * date: 7/24/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class CatFactory implements  AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
