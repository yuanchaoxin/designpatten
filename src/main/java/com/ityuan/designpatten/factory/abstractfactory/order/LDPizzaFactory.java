package com.ityuan.designpatten.factory.abstractfactory.order;

import com.ityuan.designpatten.factory.abstractfactory.pizza.LDCheesePizza;
import com.ityuan.designpatten.factory.abstractfactory.pizza.LDGreekPizza;
import com.ityuan.designpatten.factory.abstractfactory.pizza.Pizza;

/**
 * @ClassName LDPizzaFactory
 * @Package com.ityuan.designpatten.factory.abstractfactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class LDPizzaFactory implements AbstractFactory{

    @Override
    public Pizza createPizza(String orderType) {
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
