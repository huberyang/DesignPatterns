package com.hy.testfactory;

import com.hy.testfactory.calculate.Operation;
import com.hy.testfactory.calculate.OperationFactory;
import com.hy.testfactory.utils.ScannerFactory;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description: use factory mode to realize a calculator
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        System.out.println("welcome to use ICalculator");
        System.out.println("please insert the operator...");
        Scanner scanner=ScannerFactory.getScanner();
        String operator =scanner.nextLine();
        //根据操作符使用工厂类创建对应的具体操作类
        CalculatorFactory calculator = new OperationFactory();
        Operation operation= calculator.getOperation(operator);
        operation.operate();
        System.out.println(operation.result());

    }
}
