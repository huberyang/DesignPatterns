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
public class Store {

    private DiscountStrategy discountStrategy;

    public Store(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }

    public double discountActivity(Double price){
       return  discountStrategy.discount(price);
    }
}
