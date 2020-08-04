package com.hy.mediator;

/**
 * author: hubery yang
 * date: 8/3/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Country CHINA=new China(10,10);
        Country USA =new USA(10,10);

        Trade trade =new WTO();
        trade.doTrade(CHINA,USA);

        System.out.println("CHINA:  Golds: "+CHINA.getGolds()+" Goods: "+CHINA.getGoods());
        System.out.println("USA:  Golds: "+USA.getGolds()+" Goods: "+USA.getGoods());
    }
}
