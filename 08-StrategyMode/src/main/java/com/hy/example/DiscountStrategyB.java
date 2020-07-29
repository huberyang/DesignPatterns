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
public class DiscountStrategyB implements DiscountStrategy {

    // B -- Over 200 return 50
    @Override
    public double discount(double price) {
        if(price>=200){
            return price-50;
        }
        return price;
    }
}
