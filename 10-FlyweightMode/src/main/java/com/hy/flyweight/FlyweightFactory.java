package com.hy.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author: hubery yang
 * date: 7/31/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class FlyweightFactory {

    private Map<Character, ConcreteFlyWeight> pool;

    public FlyweightFactory() {
        pool = new HashMap<Character, ConcreteFlyWeight>();
    }

    public ConcreteFlyWeight getFlyWeight(Character flyweight) {

        ConcreteFlyWeight concreteFlyWeight = pool.get(flyweight);
        if (concreteFlyWeight == null) {
            concreteFlyWeight = new ConcreteFlyWeight(flyweight);
            pool.put(flyweight, concreteFlyWeight);
            return concreteFlyWeight;
        } else {
            return concreteFlyWeight;
        }
    }
}
