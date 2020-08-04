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
public class Pokemen extends Game {
    @Override
    public void init() {
        System.out.println("Pokemen: game init...");
    }

    @Override
    public void begin() {
        System.out.println("Pokemen: game begin...");
    }

    @Override
    public void end() {
        System.out.println("Pokemen: game end...");
    }
}
