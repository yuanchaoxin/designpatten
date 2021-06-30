package com.ityuan.designpatten.adapter.objectadapter;

/**
 * @ClassName VoltageAdapter
 * @Package com.ityuan.designpatten.adapter.objectadapter
 * @Author yuanchaoxin
 * @Date 2021/7/1
 * @Version 1.0
 * @Description
 */
public class VoltageAdapter implements IVoltage5V{

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int des = 0;
        if (voltage220V != null) {
            des = voltage220V.output220V() / 44;
        }
        System.out.println("使用对象适配器");
        return des;
    }
}
