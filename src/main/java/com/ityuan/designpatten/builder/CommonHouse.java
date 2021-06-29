package com.ityuan.designpatten.builder;

/**
 * @ClassName CommoneHouse
 * @Package com.ityuan.designpatten.builder
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5m");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖房顶");
    }
}
