package com.ityuan.designpatten.factory.simplefactory.order;

import com.ityuan.designpatten.factory.simplefactory.pizza.CheesePizza;
import com.ityuan.designpatten.factory.simplefactory.pizza.GreekPizza;
import com.ityuan.designpatten.factory.simplefactory.pizza.PepperPizza;
import com.ityuan.designpatten.factory.simplefactory.pizza.Pizza;

/**
 * @ClassName SimpleFactory
 * @Package com.ityuan.designpatten.factory.simplefactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese 披萨");
        } else if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("greek 披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("pepper 披萨");
        }

        return pizza;
    }
}
