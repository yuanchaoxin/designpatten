package com.ityuan.designpatten.factory.abstractfactory.order;

/**
 * @ClassName OrderStore
 * @Package com.ityuan.designpatten.factory.abstractfactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class OrderStore {
    public static void main(String[] args) {
        //new OrderPizza(new BjPizzaFactory());
        new OrderPizza(new LDPizzaFactory());
    }
}
