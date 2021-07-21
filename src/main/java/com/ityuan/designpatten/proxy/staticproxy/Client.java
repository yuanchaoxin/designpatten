package com.ityuan.designpatten.proxy.staticproxy;

import lombok.val;

/**
 * @ClassName Client
 * @Package com.ityuan.designpatten.proxy.staticproxy
 * @Author yuanchaoxin
 * @Date 2021/7/21
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();
    }
}
