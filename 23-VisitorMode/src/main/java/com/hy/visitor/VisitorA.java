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
public class VisitorA implements Visitor {
    /*@Override
    public void visit(Park park) {
    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("Cleaner A completed the work at ParkA");
    }

    @Override
    public void visit(ParkB parkB) {

    }*/

    @Override
    public void visit(ParkElement parkA) {
        System.out.println("Cleaner A completed the work at ParkA");
    }
}
