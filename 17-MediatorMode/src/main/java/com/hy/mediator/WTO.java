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
public class WTO implements  Trade{

    @Override
    public void doTrade(Country input, Country output) {
        input.buy();
        output.sell();
    }
}
