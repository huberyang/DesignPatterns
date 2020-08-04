package com.hy.mediator;

/**
 * author: hubery yang
 * date: 8/4/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public abstract class Country {

    private int goods;
    private int golds;

    public Country(int goods, int golds) {
        this.goods = goods;
        this.golds = golds;
    }

    public int getGoods() {
        return goods;
    }

    public void setGoods(int goods) {
        this.goods = goods;
    }

    public int getGolds() {
        return golds;
    }

    public void setGolds(int golds) {
        this.golds = golds;
    }

    public abstract void sell();

    public abstract  void buy();

}
