package com.ityuan.designpatten.builder;

import javax.lang.model.element.NestingKind;

/**
 * @ClassName House
 * @Package com.ityuan.designpatten.builder
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description
 */
public class House {

    private String baise;
    private String wall;
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
