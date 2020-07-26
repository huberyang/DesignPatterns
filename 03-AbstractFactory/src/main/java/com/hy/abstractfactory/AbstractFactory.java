package com.hy.abstractfactory;

import com.hy.abstractfactory.animal.Animal;
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
public abstract class AbstractFactory {

    public abstract Animal createAnimal(String animal) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    public abstract Plant createPlant(String plant) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
