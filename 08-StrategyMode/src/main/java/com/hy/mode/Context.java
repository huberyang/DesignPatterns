package com.hy.mode;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void operate(){
        strategy.encrypt();
    }
}
