package com.ityuan.designpatten.factory.simplefactory.pizza;

/**
 * @ClassName CheesePizza
 * @Package com.ityuan.designpatten.factory.simplefactory.pizza
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class CheesePizza extends Pizza{

    @Override
    public void perpare() {
        System.out.println("制作奶酪披萨，准备原材料");
    }
}
