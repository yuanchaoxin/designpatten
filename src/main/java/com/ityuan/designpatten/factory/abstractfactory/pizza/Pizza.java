package com.ityuan.designpatten.factory.abstractfactory.pizza;

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
        System.out.println(name + "bake");
    }

    public void cut() {
        System.out.println(name + "cut");
    }

    public void box() {
        System.out.println(name + "box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
