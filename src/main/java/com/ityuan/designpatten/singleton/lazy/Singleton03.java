package com.ityuan.designpatten.singleton.lazy;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Singleton03
 * @Package com.ityuan.designpatten.singleton.lazy
 * @Author yuanchaoxin
 * @Date 2021/6/16
 * @Version 1.0
 * @Description
 */
public class Singleton03 {

    private Singleton03() {}

    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton03();
        }
        return instance;
    }
}
