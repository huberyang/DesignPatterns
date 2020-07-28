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
public class HDBBuilder implements Builder {

    public Building building =new Building();

    @Override
    public void buildWall() {
        building.setWall("HDB--Wall");
    }

    @Override
    public void buildRoof() {
        building.setRoof("HDB--Roof");
    }

    @Override
    public void buildFloor() {
        building.setFloor("HDB--Floor");
    }

    @Override
    public void buildGym() {

    }

    @Override
    public void buildSwimmingPool() {

    }

    @Override
    public Building deliverBuilding() {
        return building;
    }
}
