package com.ityuan.designpatten.adapter.objectadapter;

/**
 * @ClassName Phone
 * @Package com.ityuan.designpatten.adapter.objectadapter
 * @Author yuanchaoxin
 * @Date 2021/7/1
 * @Version 1.0
 * @Description
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V,可以充电");
        } else {
            System.out.println("电压不匹配，不能充电");
        }
    }
}
