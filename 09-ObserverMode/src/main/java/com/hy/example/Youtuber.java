package com.hy.example;

import java.util.Observable;

/**
 * author: hubery yang
 * date: 7/30/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Youtuber extends Observable {

    public void publish(String title,String content){
        Vlog vlog=new Vlog(title,content);
        System.out.println("Vlog: title: "+title + ", content: "+content);
        this.setChanged();
        this.notifyObservers(vlog);
    }
}
