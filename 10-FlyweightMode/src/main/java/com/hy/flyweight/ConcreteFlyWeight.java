package com.hy.flyweight;

/**
 * author: hubery yang
 * date: 7/31/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ConcreteFlyWeight {
    private char cr;

    public ConcreteFlyWeight(char c) {
        this.cr = c;
    }

    public char getCr() {
        return cr;
    }

    public void setCr(char cr) {
        this.cr = cr;
    }
}
