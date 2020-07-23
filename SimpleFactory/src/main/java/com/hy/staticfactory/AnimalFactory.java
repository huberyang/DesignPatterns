package com.hy.staticfactory;

/**
 * author: hubery yang
 * date: 7/23/2020
 * description:
 * title: AnimalFactory
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class AnimalFactory {

    /**
     * 第一种，不推荐
     * 每当有新的类都需要来创建获取其实例的方法，显得很笨拙
     */
    public static Animal getDog(){
        return new Dog();
    }

    public static Animal getCat(){
        return new Cat();
    }

    /**
     * 第二种，通过类型判断
     * 但是当新的类需要创建对象是依旧需要对工厂类进行修改
     */
    public static Animal getAnimal(String type) throws IllegalAccessException, InstantiationException {
        if(type.equalsIgnoreCase("dog")){
            return Dog.class.newInstance();
        }else if(type.equalsIgnoreCase("cat")){
            return Cat.class.newInstance();
        }else{
            System.out.println("Class not found...");
            return null;
        }
    }

    /**
     * 第三种，通过完整的类名直接创建
     * 优点，当新的类可以直接创建对应对象而无需修改工厂类
     *
     */
    public static Animal getAnimalFinal(String ClassName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Animal) Class.forName(ClassName).newInstance();
    }







}
