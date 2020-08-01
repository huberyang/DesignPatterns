package com.hy.example;

import java.util.HashMap;
import java.util.Map;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class DogFactory {

    private Map<String,Dog> pool;

    public DogFactory(){
        pool=new HashMap<String,Dog>();
    }

    public Dog getDog(String number){
        Dog dog=pool.get(number);
        if(dog==null){
            dog=new Dog();
            dog.setNumber(number);
            pool.put(number,dog);
        }
        return dog;
    }

}
