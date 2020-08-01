package com.hy.proxy;

/**
 * author: hubery yang
 * date: 8/1/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject=subject;
    }

    @Override
    public void sellBook() {
        discount();
        subject.sellBook();
        giveSmallGift();

    }

    public void discount(){
        System.out.println("50% Off");
    }

    public void giveSmallGift(){
        System.out.println("Give a small gift");
    }
}
