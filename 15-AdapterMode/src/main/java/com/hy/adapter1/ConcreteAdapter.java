package com.hy.adapter1;

/**
 * author: hubery yang
 * date: 8/2/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class ConcreteAdapter implements VoltageAdapter{

    @Override
    public Voltage CHINAToUSA(Voltage voltage) {
        Voltage usa=new USA110(voltage.getVoltage()/2);
        return usa;
    }
}
