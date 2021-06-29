package com.ityuan.designpatten.factory.simplefactory.order;

import com.ityuan.designpatten.factory.simplefactory.pizza.CheesePizza;
import com.ityuan.designpatten.factory.simplefactory.pizza.GreekPizza;
import com.ityuan.designpatten.factory.simplefactory.pizza.PepperPizza;
import com.ityuan.designpatten.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Package com.ityuan.designpatten.factory.simplefactory.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class OrderPizza {

    public OrderPizza() {
        System.out.println("欢迎光临");
        System.out.println("=====购物开始=====");
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("cheese 披萨");
            } else if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("greek 披萨");
            } else if ("pepper".equals(orderType)) {
                pizza = new PepperPizza();
                pizza.setName("pepper 披萨");
            } else {
                System.out.println("没有相应的披萨");
                System.out.println("=====购物结束,拜拜=====");
                break;
            }

            pizza.perpare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入披萨类型:");
            String line = reader.readLine();
            return line;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
