package com.ityuan.designpatten.factory.abstractfactory.order;

import com.ityuan.designpatten.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Package com.ityuan.designpatten.factory.abstractfactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class OrderPizza {

    private AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        setAbstractFactory(abstractFactory);
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
        System.out.println("======欢迎光临，购物开始======");
        String orderType = "";
        Pizza pizza = null;
        do {
            orderType = getOrderType();
            pizza = abstractFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.perpare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("====没有相应披萨，购物结束，拜拜====");
                break;
            }
        } while (true);
    }

    private String getOrderType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入披萨类型: ");
            String readLine = bufferedReader.readLine();
            return readLine;
        } catch (Exception e) {

        }
        return "";
    }

    public AbstractFactory getAbstractFactory() {
        return abstractFactory;
    }

}
