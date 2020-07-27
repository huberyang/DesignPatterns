package com.hy.testfactory.calculate;

import com.hy.testfactory.utils.ScannerFactory;

import java.util.Scanner;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Multiply extends Operation {

    @Override
    public String operate() {
        Scanner input = ScannerFactory.getScanner();
        System.out.println("Please insert your first element");
        this.setEle1(input.nextLine());
        System.out.println("Please insert your second element");
        this.setEle2(input.nextLine());
        this.setResult(String.valueOf(Integer.parseInt(this.getEle1()) * Integer.parseInt(this.getEle2())));
        return this.getResult();
    }

    @Override
    public String result() {
        return this.getEle1()+" * "+ this.getEle2()+" = " +this.getResult();
    }
}
