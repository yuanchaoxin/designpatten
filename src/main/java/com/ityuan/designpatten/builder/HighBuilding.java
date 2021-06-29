package com.ityuan.designpatten.builder;

/**
 * @ClassName HighBuilding
 * @Package com.ityuan.designpatten.builder
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼地基100米");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙30cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖楼顶");
    }
}
