package com.ityuan.designpatten.singleton;

import com.ityuan.designpatten.singleton.hungry.Singleton01;
import com.ityuan.designpatten.singleton.hungry.Singleton02;
import com.ityuan.designpatten.singleton.lazy.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName SingletonTest
 * @Package com.ityuan.designpatten.singleton
 * @Author yuanchaoxin
 * @Date 2021/6/16
 * @Version 1.0
 * @Description
 */
//@SpringBootTest
public class SingletonTest {

    @Test
    public void Singleton01Test() {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton011 = Singleton01.getInstance();

        System.out.println(singleton01 == singleton011);

        System.out.println("singleton01:"+singleton01.hashCode());
        System.out.println("singleton011:"+singleton011.hashCode());
    }

    @Test
    public void Singleton02Test() {
        Singleton02 singleton02 = Singleton02.getInstance();
        Singleton02 singleton021 = Singleton02.getInstance();

        System.out.println(singleton02 == singleton021);

        System.out.println("singleton02:"+singleton02.hashCode());
        System.out.println("singleton021:"+singleton021.hashCode());
    }

    @Test
    public void Singleton03Test() {
        Singleton03 singleton02 = Singleton03.getInstance();
        Singleton03 singleton021 = Singleton03.getInstance();

        System.out.println(singleton02 == singleton021);

        System.out.println("singleton02:"+ singleton02.hashCode());
        System.out.println("singleton021:"+singleton021.hashCode());
    }

    @Test
    public void Singleton04Test() {
        Singleton04 singleton1 = Singleton04.getInstance();
        Singleton04 singleton2 = Singleton04.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1:"+ singleton1.hashCode());
        System.out.println("singleton2:"+ singleton2.hashCode());
    }

    @Test
    public void Singleton05Test() {
        Singleton05 singleton1 = Singleton05.getInstance();
        Singleton05 singleton2 = Singleton05.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1:"+ singleton1.hashCode());
        System.out.println("singleton2:"+ singleton2.hashCode());
    }

    @Test
    public void Singleton06Test() {
        Singleton06 singleton1 = Singleton06.getInstance();
        Singleton06 singleton2 = Singleton06.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1:"+ singleton1.hashCode());
        System.out.println("singleton2:"+ singleton2.hashCode());
    }

    @Test
    public void Singleton07Test() {
        Singleton07 singleton1 = Singleton07.INSTANCE;
        Singleton07 singleton2 = Singleton07.INSTANCE;

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1:"+ singleton1.hashCode());
        System.out.println("singleton2:"+ singleton2.hashCode());
    }
}
