package com.hy.staticfactory;

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
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        /**
         * 1.不推荐，很僵硬的手动创建实例对象
         */
        new Dog().voice();
        new Cat().voice();

        /**
         * 2.通过工厂手动创建
         * 和第一种没啥大区别，无非就是通过工厂类同一管理
         * 创建实例对象依旧不够灵活
         */
        AnimalFactory.getDog().voice();
        AnimalFactory.getDog().voice();

        /**
         * 3.通过工厂创建，并且根据类名判断创建哪一个类的实例
         * 创建对象不够灵活，当新的类需要常见对象时任然需要修改工厂类
         */
//        AnimalFactory.getAnimal("dog").voice();
//        AnimalFactory.getAnimal("cat").voice();

        /**
         * 4.通完整类名直接创建
         * 当有新的类需要创建实例时也可以直接使用该工程类，
         *
         * 注意：AnimalFactory.getAnimalFinal("Dog").voice();
         * Exception in thread "main" java.lang.ClassNotFoundException: Dog at java.net.URLClassLoader.findClass
         * URLClassLoader.findClass爆出ClassNotFound异常，源自类加载器根据用户指定的类名无法找到对应的类，
         *
         * 解释：单纯的只是给出了类名，却没有给出Qualified Name(全限定名) 例如:com.hy.staticfactory.Dog
         * 原因: 如果项目内不同package下存在同名Dog类，如果我们不给定Qualified Name，那系统怎么知道这个Dog指的是哪一个类
         */
        //AnimalFactory.getAnimalFinal("com.hy.staticfactory.Dog").voice();
        //AnimalFactory.getAnimalFinal("com.hy.staticfactory.Cat").voice();


    }
}
