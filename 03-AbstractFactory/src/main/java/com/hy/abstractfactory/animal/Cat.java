package com.hy.abstractfactory.animal;

import com.hy.abstractfactory.animal.Animal;

/**
 * author: hubery yang
 * date: 7/23/2020
 * description:
 * title: Cat
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Cat implements Animal {

    @Override
    public void voice(){
        System.out.println("MiaoMiao...");
    }
}
