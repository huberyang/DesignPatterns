package com.hy.facade;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade(){
        this.systemA=new SystemA();
        this.systemB=new SystemB();
        this.systemC=new SystemC();
    }

    public void doABC(){
        systemA.dosomething();
        systemB.dosomething();
        systemC.dosomething();
    }

    public void doAB(){
        systemA.dosomething();
        systemB.dosomething();
    }

    public void doBC(){
        systemB.dosomething();
        systemC.dosomething();
    }


}
