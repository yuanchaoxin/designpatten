package com.ityuan.designpatten.adapter.objectadapter;

/**
 * @ClassName Client
 * @Package com.ityuan.designpatten.adapter.objectadapter
 * @Author yuanchaoxin
 * @Date 2021/7/1
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
