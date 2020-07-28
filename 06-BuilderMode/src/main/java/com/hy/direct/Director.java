package com.hy.direct;

import com.hy.builder.Builder;
import com.hy.building.Building;

/**
 * author: hubery yang
 * date: 7/28/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class Director {

    public Building directBuilder(Builder builder){
        //指导修建，并交付建筑
        builder.buildFloor();
        builder.buildRoof();
        builder.buildWall();
        builder.buildGym();
        builder.buildSwimmingPool();

        return builder.deliverBuilding();
    }

}
