package com.hy.singleton.doublecheck;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Panda {

    public String name;
    public static Panda panda;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Panda getPanda() {
        //first check
        if (panda == null) {
            /**
             * exist multiple threads entering this judgement at the same time
             * so need second check
             */
            synchronized (Panda.class) {
                //second check
                if (panda == null) {
                    panda = new Panda();
                }
            }
        }
        return panda;
    }
}
