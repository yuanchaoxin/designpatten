package com.ityuan.designpatten.proxy.dynamicproxy;

/**
 * @ClassName Client
 * @Package com.ityuan.designpatten.proxy.dynamicproxy
 * @Author yuanchaoxin
 * @Date 2021/7/21
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {

        ITeacherDao teacherDao = new TeacherDao();

        ITeacherDao targetProxy = (ITeacherDao) new ProxyFactory(teacherDao).getTargetProxy();

        targetProxy.teach();

    }
}
