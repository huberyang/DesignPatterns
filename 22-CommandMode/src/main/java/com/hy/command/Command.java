package com.hy.command;

/**
 * author: hubery yang
 * date: 8/9/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public abstract class Command {
    protected Store store;

    public Command(Store store){
        this.store=store;
    }

    public abstract void sell();

}
