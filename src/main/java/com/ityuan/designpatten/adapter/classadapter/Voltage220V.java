package com.ityuan.designpatten.adapter.classadapter;

/**
 * @ClassName Votage220V
 * @Package com.ityuan.designpatten.adapter.classadapter
 * @Author yuanchaoxin
 * @Date 2021/7/1
 * @Version 1.0
 * @Description
 */
public class Voltage220V {

    public int output220v() {
        int src = 220;
        System.out.println("电压 = " +src+ "V");
        return src;
    }
}
