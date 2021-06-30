package com.ityuan.designpatten.adapter.interfaceadapter;

/**
 * @ClassName Client
 * @Package com.ityuan.designpatten.adapter.interfaceadapter
 * @Author yuanchaoxin
 * @Date 2021/7/1
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        AbstractAdapterClass adapterClass = new AbstractAdapterClass() {
            @Override
            public void method1() {
                System.out.println("使用了方法一");
            }
        };

        adapterClass.method1();
    }
}
