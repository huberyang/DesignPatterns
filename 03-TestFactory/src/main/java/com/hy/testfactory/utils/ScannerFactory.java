package com.hy.testfactory.utils;

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
public class ScannerFactory {

    private static Scanner scanner;

    /**
     * when class used by system, this part will be called
     */
    static {
        scanner=new Scanner(System.in);
    }

    public static Scanner getScanner(){
        return scanner;
    }
}
