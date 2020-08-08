package com.hy.state;

/**
 * author: hubery yang
 * date: 8/8/2020
 * description:
 * title:
 * version:
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class DState extends State {
    @Override
    public void activity(Dog dog) {
        if(dog.getTime()==18){
            System.out.println("eat Dinner");
        }else{
            System.out.println("Undefined");
        }
    }
}
