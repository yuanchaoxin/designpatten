package com.ityuan.designpatten.factory.simplefactory.order;

import com.ityuan.designpatten.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizzaFactory
 * @Package com.ityuan.designpatten.factory.simplefactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class OrderPizzaFactory {

    private SimpleFactory simpleFactory;

    public OrderPizzaFactory(SimpleFactory simpleFactory) throws IOException {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) throws IOException {
        System.out.println("====欢迎光临，购物开始====");
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.perpare();
                pizza.bake();
                pizza.box();
                pizza.cut();
            } else {
                System.out.println("没有对应披萨");
                System.out.println("====购物结束，拜拜=====");
                break;
            }
        } while (true);
    }

    private String getOrderType() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入披萨类型:");
        String readLine = bufferedReader.readLine();
        return readLine;
    }

    public SimpleFactory getSimpleFactory() {
        return simpleFactory;
    }

}
