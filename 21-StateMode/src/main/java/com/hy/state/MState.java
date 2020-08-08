package com.hy.state;

/**
 * author: hubery yang
 * date: 8/7/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MState extends State {

    @Override
    public void activity(Dog dog) {
        if(dog.getTime()==7){
            System.out.println("eat Breakfast");
        }else{
            dog.setState(new LState());
            dog.behavior();
        }
    }
}
