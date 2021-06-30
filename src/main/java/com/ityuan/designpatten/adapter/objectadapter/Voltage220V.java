package com.ityuan.designpatten.adapter.objectadapter;

/**
 * @ClassName Voltage220V
 * @Package com.ityuan.designpatten.adapter.objectadapter
 * @Author yuanchaoxin
 * @Date 2021/7/1
 * @Version 1.0
 * @Description
 */
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("输出电压：" + src + "V");
        return src;
    }
}
