package com.hy.testfactory.calculate;

import com.hy.testfactory.CalculatorFactory;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class OperationFactory implements CalculatorFactory {

    @Override
    public Operation getOperation(String operator) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if ("+".equals(operator)) {
            return (Operation) Class.forName("com.hy.testfactory.calculate.Plus").newInstance();
        } else if ("-".equals(operator)) {
            return (Operation) Class.forName("com.hy.testfactory.calculate.Minus").newInstance();
        } else if ("*".equals(operator)) {
            return (Operation) Class.forName("com.hy.testfactory.calculate.Multiply").newInstance();
        } else if ("/".equals(operator)) {
            return (Operation) Class.forName("com.hy.testfactory.calculate.Devideby").newInstance();
        } else {
            System.out.println("this operator is not currently supported");
            return null;
        }

    }
}
