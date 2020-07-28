package com.hy.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hubery yang
 * date: 7/28/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Dog implements Cloneable {

    private String name;
    private int age;

    //当克隆对象涉及到属性存在引用对象时，此时需要考虑浅克隆和深克隆
    private List<String> toys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getToys() {
        return toys;
    }

    public void setToys(List<String> toys) {
        this.toys = toys;
    }

    public Dog clone() {
        try {
            List<String> toys = new ArrayList<>();
            for (String toy : this.getToys()) {
                toys.add(toy);
            }
            Dog dog = (Dog) super.clone();
            dog.setToys(toys);

            return dog;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


}
