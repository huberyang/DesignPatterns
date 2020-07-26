package com.hy.abstractfactory;

/**
 * author: hubery yang
 * date: 7/26/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class FactoryCreator {
    /**
     *
     * @param factoryFullName 工厂完整类名
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static AbstractFactory createFactory(String factoryFullName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       return (AbstractFactory) Class.forName(factoryFullName).newInstance();
    }
}
