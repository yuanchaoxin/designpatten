package com.ityuan.designpatten.proxy.cglibproxy;

/**
 * @ClassName Client
 * @Package com.ityuan.designpatten.proxy.cglibproxy
 * @Author yuanchaoxin
 * @Date 2021/7/21
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();

        TeacherDao target = (TeacherDao) new ProxyFactory(teacherDao).getTarget();

        target.teach();
    }
}
