package com.hy.singleton;

import com.hy.singleton.doublecheck.Panda;
import com.hy.singleton.hungrymode.Dog;
import com.hy.singleton.lazymode.Cat;

import java.sql.SQLOutput;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {

    public static void main(String[] args) {

        //----------------hungry mode--------thread safety--------------------
        Dog dog1 =Dog.getDog();
        Dog dog2 =Dog.getDog();

        dog1.setName("wang cai");
        dog2.setName("xiao bai");

        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

        //-----------lazy mode-------thread not safety--------------

        Cat cat1 =Cat.getCat();
        Cat cat2 =Cat.getCat();

        cat1.setName("li hua");
        cat2.setName("pang ju");

        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        //----------double check mode -------thread safety-------------------------
        Panda panda1 = Panda.getPanda();
        Panda panda2 = Panda.getPanda();
        panda1.setName("bei bei");
        panda2.setName("jing jing");

        System.out.println(panda1.getName());
        System.out.println(panda2.getName());


    }
}
