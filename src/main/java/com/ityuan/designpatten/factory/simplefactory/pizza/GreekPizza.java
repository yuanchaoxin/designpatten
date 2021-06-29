package com.ityuan.designpatten.factory.simplefactory.pizza;

/**
 * @ClassName GreekPizza
 * @Package com.ityuan.designpatten.factory.simplefactory.pizza
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class GreekPizza extends Pizza{

    @Override
    public void perpare() {
        System.out.println("制作希腊披萨,准备原材料");
    }
}
