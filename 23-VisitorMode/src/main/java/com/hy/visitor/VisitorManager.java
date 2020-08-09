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
public class VisitorManager implements Visitor {
    /*@Override
    public void visit(Park park) {
        System.out.println("Manager completed the review work at Park");
    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("Manager completed the review work at ParkB");
    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("Manager completed the review work at ParkB");
    }*/

    @Override
    public void visit(ParkElement parkA) {
        System.out.println("Manager completed the review work at Park");
        System.out.println("Manager completed the review work at ParkA");
        System.out.println("Manager completed the review work at ParkB");
    }
}
