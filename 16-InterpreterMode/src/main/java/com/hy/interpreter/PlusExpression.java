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
public class PlusExpression implements Expression {

    @Override
    public Context interpreter(Context context) {
        System.out.println("自动递增");
        int input=Integer.parseInt(context.getInput());
         input++;
         context.setInput(String.valueOf(input));
         return context;
    }
}
