package com.ityuan.designpatten.factory.factorymethod.order;

import com.ityuan.designpatten.factory.factorymethod.pizza.LDCheesePizza;
import com.ityuan.designpatten.factory.factorymethod.pizza.LDGreekPizza;
import com.ityuan.designpatten.factory.factorymethod.pizza.Pizza;

/**
 * @ClassName LDOrderPizza
 * @Package com.ityuan.designpatten.factory.factorymethod.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class LDOrderPizza  extends OrderPizza{

    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
            pizza.setName("LDCheesePizza");
        } else if ("greek".equals(orderType)) {
            pizza = new LDGreekPizza();
            pizza.setName("LDGreekPizza");
        }
        return pizza;
    }
}
