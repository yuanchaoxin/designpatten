package com.ityuan.designpatten.factory.factorymethod.order;

import com.ityuan.designpatten.factory.factorymethod.pizza.*;
import com.ityuan.designpatten.factory.simplefactory.pizza.CheesePizza;

/**
 * @ClassName LDOrderPizza
 * @Package com.ityuan.designpatten.factory.factorymethod.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class BJOrderPizza extends OrderPizza{

    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
            pizza.setName("BJCheesePizza");
        } else if ("greek".equals(orderType)) {
            pizza = new BJGreekPizza();
            pizza.setName("BJGreekPizza");
        }
        return pizza;
    }
}
