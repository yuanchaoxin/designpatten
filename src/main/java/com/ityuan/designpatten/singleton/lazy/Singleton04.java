package com.ityuan.designpatten.singleton.lazy;

/**
 * @ClassName Singleton04
 * @Package com.ityuan.designpatten.singleton.lazy
 * @Author yuanchaoxin
 * @Date 2021/6/17
 * @Version 1.0
 * @Description
 */
public class Singleton04 {
    private Singleton04() {}

    private static volatile Singleton04 instance;

    public synchronized static Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}
