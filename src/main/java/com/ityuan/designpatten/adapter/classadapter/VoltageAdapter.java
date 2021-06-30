package com.ityuan.designpatten.adapter.classadapter;

/**
 * @ClassName VotageAdapter
 * @Package com.ityuan.designpatten.adapter.classadapter
 * @Author yuanchaoxin
 * @Date 2021/7/1
 * @Version 1.0
 * @Description
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5v() {
        int srcV = output220v();
        int destV = srcV / 44;
        return destV;
    }
}
