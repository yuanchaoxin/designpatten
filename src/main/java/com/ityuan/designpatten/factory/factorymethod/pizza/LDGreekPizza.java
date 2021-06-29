package com.ityuan.designpatten.factory.factorymethod.pizza;

/**
 * @ClassName BJGreekPizza
 * @Package com.ityuan.designpatten.factory.factorymethod.pizza
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class LDGreekPizza extends Pizza{

    @Override
    public void perpare() {
        System.out.println("LDGreekPizza 披萨准备原材料");
    }
}
