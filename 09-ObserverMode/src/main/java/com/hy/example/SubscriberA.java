package com.hy.example;

import java.util.Observable;
import java.util.Observer;

/**
 * author: hubery yang
 * date: 7/30/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class SubscriberA implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Vlog vlog= (Vlog) arg;
        System.out.println("SubscriblerA got the vlog"+"---title:"+vlog.getTitle() +", content: "+vlog.getContent() );
    }
}
