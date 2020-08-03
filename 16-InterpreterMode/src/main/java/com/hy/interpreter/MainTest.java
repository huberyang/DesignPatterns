package com.hy.interpreter;

/**
 * author: hubery yang
 * date: 8/3/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Context context=new Context("10");
        Expression expression=new PlusExpression();
        Context result = expression.interpreter(context);

        System.out.println("递增："+result.getInput());

    }
}
