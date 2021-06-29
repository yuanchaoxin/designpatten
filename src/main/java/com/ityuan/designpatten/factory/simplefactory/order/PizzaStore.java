package com.ityuan.designpatten.factory.simplefactory.order;

import java.io.IOException;

/**
 * @ClassName PizzaStore
 * @Package com.ityuan.designpatten.factory.simplefactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class PizzaStore {

    public static void main(String[] args) throws IOException {
        //new OrderPizza();
        new OrderPizzaFactory(new SimpleFactory());
    }
}
