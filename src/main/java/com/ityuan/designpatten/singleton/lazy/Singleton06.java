package com.ityuan.designpatten.singleton.lazy;

/**
 * @ClassName Singleton06
 * @Package com.ityuan.designpatten.singleton.lazy
 * @Author yuanchaoxin
 * @Date 2021/6/17
 * @Version 1.0
 * @Description
 */
public class Singleton06 {
    private Singleton06() {}

    private static class SingletonInstance{
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static synchronized Singleton06 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
