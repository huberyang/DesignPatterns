package com.hy.example;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        DogFactory factory=new DogFactory();

        Dog dog1=factory.getDog("001");
        Dog dog2=factory.getDog("002");
        Dog dog3=factory.getDog("003");
        Dog dog4=factory.getDog("002");

        if(dog2==dog4){
            System.out.println("dog2==dog4: true");
        }else{
            System.out.println("dog2==dog4: false");
        }
    }
}
