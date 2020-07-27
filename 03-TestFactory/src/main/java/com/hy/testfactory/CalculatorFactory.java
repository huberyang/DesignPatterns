package com.hy.testfactory;

import com.hy.testfactory.calculate.Operation;

/**
 * author: hubery yang
 * date: 7/27/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public interface CalculatorFactory{

    public Operation getOperation(String operator) throws ClassNotFoundException, IllegalAccessException, InstantiationException;

}
