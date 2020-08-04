package com.hy.template;

/**
 * author: hubery yang
 * date: 8/4/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        Game lol=new LOL();
        lol.play();

        System.out.println("------------------");

        Game pokemen=new Pokemen();
        pokemen.play();
    }
}
