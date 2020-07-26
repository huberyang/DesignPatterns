package com.hy.abstractfactory.animal;

import com.hy.abstractfactory.AbstractFactory;
import com.hy.abstractfactory.plant.Grass;
import com.hy.abstractfactory.plant.Plant;

/**
 * author: hubery yang
 * date: 7/26/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class AnimalFactory extends AbstractFactory {

    @Override
    public Animal createAnimal(String animal) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Animal ani = (Animal) Class.forName(animal).newInstance();
        return ani;
    }

    @Override
    public Plant createPlant(String plant) {
        return null;
    }
}
