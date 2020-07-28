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
public class CondoBuilder implements Builder {

    public Building building = new Building();

    @Override
    public void buildWall() {
        building.setWall("Condo--Wall");
    }

    @Override
    public void buildRoof() {
        building.setRoof("Condo--Roof");
    }

    @Override
    public void buildFloor() {
        building.setFloor("Condo--Floor");
    }

    @Override
    public void buildGym() {
        building.setGym("Condo--Gym");
    }

    @Override
    public void buildSwimmingPool() {
        building.setSwimmingPool("Condo--SwimmingPool");
    }

    @Override
    public Building deliverBuilding() {
        return building;
    }
}
