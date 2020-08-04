package com.hy.memento;

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

        TbRow row=new TbRow("Hubery","17",'M');
        row.backup();
        row.displayRow();

        row.setName("JACk");
        row.displayRow();

        row.rowback();
        row.displayRow();
    }
}
