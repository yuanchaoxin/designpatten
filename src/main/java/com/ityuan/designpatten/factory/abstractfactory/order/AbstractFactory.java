package com.ityuan.designpatten.factory.abstractfactory.order;

import com.ityuan.designpatten.factory.abstractfactory.pizza.Pizza;

/**
 * @Description
 * @Author yuanchaoxin
 * @Date 2021/6/27 23:39
 * @Version 1.0
 */
public interface AbstractFactory {

    public Pizza createPizza(String orderType);
}
