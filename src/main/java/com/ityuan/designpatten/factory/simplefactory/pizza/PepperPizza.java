package com.ityuan.designpatten.factory.simplefactory.pizza;

/**
 * @ClassName PepperPizza
 * @Package com.ityuan.designpatten.factory.simplefactory.pizza
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class PepperPizza extends Pizza{

    @Override
    public void perpare() {
        System.out.println("制作胡椒,准备原材料");
    }
}
