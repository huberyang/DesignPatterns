package com.hy.mode;

/**
 * author: hubery yang
 * date: 7/29/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        /*Strategy encrypt =new MD5Encrypt();
        encrypt.encrypt();*/

        Context context =new Context(new Base64Encrypt());
        context.operate();
    }
}
