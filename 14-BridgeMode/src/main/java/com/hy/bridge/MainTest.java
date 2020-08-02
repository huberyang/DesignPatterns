package com.hy.bridge;

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
        Engine v6=new V6Engine();
        Engine v8=new V8Engine();
        Engine v12=new V12Engine();

        Car bus=new Bus(v6);
        bus.installEngine();

        Car suv=new Suv(v8);
        suv.installEngine();
    }
}
