package com.ityuan.designpatten.builder;

/**
 * @ClassName HouseBuilder
 * @Package com.ityuan.designpatten.builder
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
