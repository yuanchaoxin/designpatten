package com.ityuan.designpatten.singleton.hungry;

import java.security.Signature;

/**
 * @ClassName Singleton02
 * @Package com.ityuan.designpatten.singleton.hungry
 * @Author yuanchaoxin
 * @Date 2021/6/16
 * @Version 1.0
 * @Description
 */
public class Singleton02 {

    private Singleton02() {}

    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
