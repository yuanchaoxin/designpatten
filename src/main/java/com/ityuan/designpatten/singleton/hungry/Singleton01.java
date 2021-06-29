package com.ityuan.designpatten.singleton.hungry;

/**
 * @ClassName Singleton01
 * @Package com.ityuan.designpatten.singleton.hungry
 * @Author yuanchaoxin
 * @Date 2021/6/16
 * @Version 1.0
 * @Description
 */
public class Singleton01 {

    /**
     *  1、私有化构造器
     */
    private Singleton01() {}

    /**
     *  2、提供一个静态常量
     */
    private final static Singleton01 instance = new Singleton01();

    /**
     *  3、提供一个获取静态常量的方法
     */
    public static Singleton01 getInstance() {
        return instance;
    }

}
