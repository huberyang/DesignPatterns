package com.hy.abstractfactory.plant;

import com.hy.abstractfactory.AbstractFactory;
import com.hy.abstractfactory.animal.Animal;

/**
 * author: hubery yang
 * date: 7/26/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class PlantFactory extends AbstractFactory {

    @Override
    public Plant createPlant(String plant) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Plant pt = (Plant) Class.forName(plant).newInstance();
        return pt;
    }
}
