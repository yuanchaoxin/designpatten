package com.ityuan.designpatten.factory.simplefactory.pizza;

/**
 * @ClassName Pizza
 * @Package com.ityuan.designpatten.factory.simplefactory.pizza
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public abstract class Pizza {

    protected String name;

    public abstract void perpare();

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
