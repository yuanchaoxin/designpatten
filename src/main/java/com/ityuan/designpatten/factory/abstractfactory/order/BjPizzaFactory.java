package com.ityuan.designpatten.factory.abstractfactory.order;

import com.ityuan.designpatten.factory.abstractfactory.pizza.BJCheesePizza;
import com.ityuan.designpatten.factory.abstractfactory.pizza.BJGreekPizza;
import com.ityuan.designpatten.factory.abstractfactory.pizza.Pizza;

/**
 * @ClassName BjPizzaFactory
 * @Package com.ityuan.designpatten.factory.abstractfactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class BjPizzaFactory implements AbstractFactory{

    @Override
    public Pizza createPizza(String orderType) {
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
