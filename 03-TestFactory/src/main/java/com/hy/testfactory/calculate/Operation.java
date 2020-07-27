package com.hy.testfactory.calculate;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public abstract class Operation {

    private String ele1;
    private String ele2;

    private String result;

    public String getEle1() {
        return ele1;
    }

    public void setEle1(String ele1) {
        this.ele1 = ele1;
    }

    public String getEle2() {
        return ele2;
    }

    public void setEle2(String ele2) {
        this.ele2 = ele2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 执行操作，并返回对应结果
     * @return
     */
    public abstract String operate();

    public abstract String result();
}
