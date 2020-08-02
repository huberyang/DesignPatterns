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
public class ConcreteAdapter implements VoltageAdapter {

    private Voltage ChINA;
    private Voltage USA;
    private Voltage UK;

    public Voltage getChINA() {
        return ChINA;
    }

    public void setChINA(Voltage chINA) {
        ChINA = chINA;
    }

    public Voltage getUSA() {
        return USA;
    }

    public void setUSA(Voltage USA) {
        this.USA = USA;
    }

    public Voltage getUK() {
        return UK;
    }

    public void setUK(Voltage UK) {
        this.UK = UK;
    }

    @Override
    public Voltage CHINAToUSA() {
        Voltage usa=new USA110(ChINA.getVoltage()/2);
        return usa;
    }
}
