package com.hy.command;

/**
 * author: hubery yang
 * date: 8/8/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Store store=new Store();

//        store.sellApple();
//        store.sellBanana();

        Command applec=new AppleCommand(store);
        Command bananac=new BananaCommand(store);
//        applec.sell();
//        bananac.sell();

        Waiter waiter=new Waiter();
        waiter.addOrder(applec);
        waiter.addOrder(bananac);
        waiter.sell();
        waiter.cancelOrder(applec);
        waiter.sell();
    }
}
