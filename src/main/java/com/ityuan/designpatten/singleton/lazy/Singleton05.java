package com.ityuan.designpatten.singleton.lazy;

/**
 * @ClassName Singleton05
 * @Package com.ityuan.designpatten.singleton.lazy
 * @Author yuanchaoxin
 * @Date 2021/6/17
 * @Version 1.0
 * @Description
 */
public class Singleton05 {

    private Singleton05() {}

    private static volatile Singleton05 instance;

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }

        return instance;
    }
}
