package com.ityuan.designpatten.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyFactory
 * @Package com.ityuan.designpatten.proxy.dynamicproxy
 * @Author yuanchaoxin
 * @Date 2021/7/21
 * @Version 1.0
 * @Description
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getTargetProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                        target.getClass().getInterfaces(),
                        new InvocationHandler() {
                            @Override
                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                System.out.println("JDK 代理。。。。");
                                Object invoke = method.invoke(target,args);
                                return invoke;
                            }
                        });
    }
}
