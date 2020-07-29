package com.hy.example;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {

    public static void main(String[] args) {
        double price= 200;
        Store store =new Store(new DiscountStrategyB());
        double newPrice=store.discountActivity(price);
        System.out.println("after discount: "+ newPrice);

    }
}
