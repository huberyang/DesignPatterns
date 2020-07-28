package com.hy.builder;

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
public interface Builder {

    public void buildWall();

    public void buildRoof();

    public void buildFloor();

    public void buildGym();

    public void buildSwimmingPool();

    public Building deliverBuilding();

}
