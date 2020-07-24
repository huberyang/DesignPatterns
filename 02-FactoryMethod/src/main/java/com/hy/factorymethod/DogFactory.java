package com.hy.factorymethod;

/**
 * author: hubery yang
 * date: 7/23/2020
 * description:
 * title: AnimalFactory
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */

public class DogFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
