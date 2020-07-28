package com.hy;

import com.hy.builder.Builder;
import com.hy.builder.CondoBuilder;
import com.hy.builder.HDBBuilder;
import com.hy.building.Building;
import com.hy.building.Constructure;
import com.hy.direct.Director;

/**
 * author: hubery yang
 * date: 7/28/2020
 * description:
 * title:
 * version: 1.0
 *
 * @Copyright: 2019 Inc. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        //创建HDB施工队
        Builder builder = new HDBBuilder();
        //创建指导工程师
        Director director = new Director();
        //指导修建并交付建筑
        Constructure building=director.directBuilder(builder);

        System.out.println(building.getFloor());
        System.out.println(building.getRoof());
        System.out.println(building.getWall());

        //创建Condo施工队
        Builder builder2 = new CondoBuilder();
        //指导修建并交付建筑
        Building building2=director.directBuilder(builder2);

        System.out.println(building2.getFloor());
        System.out.println(building2.getRoof());
        System.out.println(building2.getWall());
        System.out.println(building2.getGym());
        System.out.println(building2.getSwimmingPool());


    }
}
