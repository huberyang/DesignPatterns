package com.hy.template;

/**
 * author: hubery yang
 * date: 8/4/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public abstract class Game {
    public abstract void init();
    public abstract void begin();
    public abstract void end();

    public final void play(){
        this.init();
        this.begin();
        this.end();
    }
}
