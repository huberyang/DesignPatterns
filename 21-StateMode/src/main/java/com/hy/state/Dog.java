package com.hy.state;

/**
 * author: hubery yang
 * date: 8/7/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Dog {

    private int time;
    private State state;

    public Dog(){
        state=new MState();
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void behavior(){
        state.activity(this);
        //还原起始state
        state=new MState();
    }
}
