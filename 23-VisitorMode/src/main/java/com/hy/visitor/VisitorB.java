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
public class VisitorB implements Visitor {
    /*@Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {

    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("Cleaner B completed the work at ParkB");
    }
    */

    @Override
    public void visit(ParkElement parkB) {
        System.out.println("Cleaner B completed the work at ParkB");
    }
}
