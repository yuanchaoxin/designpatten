package com.ityuan.designpatten.builder;

/**
 * @ClassName HouseDirector
 * @Package com.ityuan.designpatten.builder
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description
 */
public class HouseDirector {

    private HouseBuilder houseBuilder = null;

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();

        return houseBuilder.buildHouse();
    }

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
}
