package com.ityuan.designpatten.factory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderStore
 * @Package com.ityuan.designpatten.factory.factorymethod.order
 * @Author yuanchaoxin
 * @Date 2021/6/27
 * @Version 1.0
 * @Description
 */
public class OrderStore {

    public static void main(String[] args) throws IOException {
        String area = getArea();
        if ("bj".equals(area)) {
            new BJOrderPizza();
        } else if ("ld".equals(area)) {
            new LDOrderPizza();
        }
    }

    private static String getArea() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("请输入地区 bj 或 ld ：");
            String readLine = bufferedReader.readLine();
            if ("bj".equals(readLine) || "ld".equals(readLine)) {
                return readLine;
            }
        }
    }
}
