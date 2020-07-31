package com.hy.observer;

import java.util.List;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ConcreteSubject extends Subject {

    public void publish(){
        System.out.println("Concrete Subject published some thing");
        this.changed();
        this.noticeAllObserver();
    }
}
