package com.hy.adapter1;

/**
 * author: hubery yang
 * date: 8/2/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Voltage CHINA=new China220(220);
        Voltage USA = new ConcreteAdapter().CHINAToUSA(CHINA);
        System.out.println("after transform: "+USA.output());
    }
}
