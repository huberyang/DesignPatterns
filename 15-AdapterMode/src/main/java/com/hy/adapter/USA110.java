package com.hy.adapter;

/**
 * author: hubery yang
 * date: 8/2/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class USA110 extends Voltage {

    public USA110(int voltage) {
        super(voltage);
    }

    @Override
    public int output() {
        return this.getVoltage();
    }

}
