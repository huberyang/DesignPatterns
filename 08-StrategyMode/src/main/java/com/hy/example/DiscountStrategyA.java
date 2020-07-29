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
public class DiscountStrategyA implements DiscountStrategy {

    // A -- 50% Off
    @Override
    public double discount(double price) {

        return price*0.5;
    }
}
