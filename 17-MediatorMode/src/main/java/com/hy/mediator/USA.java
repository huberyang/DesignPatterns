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
public class USA extends Country {

    public USA(int goods, int golds) {
        super(goods, golds);
    }

    @Override
    public void sell() {
        int goods=this.getGoods();
        goods--;
        this.setGoods(goods);

        int golds=this.getGolds();
        golds++;
        this.setGolds(golds);
    }

    @Override
    public void buy() {
        int goods=this.getGoods();
        goods++;
        this.setGoods(goods);

        int golds=this.getGolds();
        golds--;
        this.setGolds(golds);
    }
}
