package com.hy.singleton.lazymode;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Cat {

    private String name;
    private static Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //this method is not a thread safety method
    public static Cat getCat(){
        if(cat==null){
            cat = new Cat();
        }
        return cat;
    }
}
