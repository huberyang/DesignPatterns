package com.hy.visitor;

/**
 * author: hubery yang
 * date: 8/9/2020
 * description:
 * title:
 * version:
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public interface Visitor {

    /*public void visit(Park park);

    public void visit(ParkA parkA);

    public void visit(ParkB parkB);*/

    public void visit(ParkElement park);

}
