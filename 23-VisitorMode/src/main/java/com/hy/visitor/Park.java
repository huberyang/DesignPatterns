package com.hy.visitor;

/**
 * author: hubery yang
 * date: 8/9/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Park implements ParkElement {

    private ParkA parkA;
    private ParkB parkB;

    public Park() {
        this.parkA = new ParkA();
        this.parkB = new ParkB();
    }

    @Override
    public void accept(Visitor visotor) {
        visotor.visit(this);
    }
}
