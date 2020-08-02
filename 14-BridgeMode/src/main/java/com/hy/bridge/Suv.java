package com.hy.bridge;

/**
 * author: hubery yang
 * date: 8/2/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Suv extends Car {

    public Suv(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print(this.getClass().getName()+ " ");
        this.getEngine().installEngine();
    }
}
