package com.ityuan.designpatten.proxy.staticproxy;

/**
 * @ClassName TeacherDao
 * @Package com.ityuan.designpatten.proxy.staticproxy
 * @Author yuanchaoxin
 * @Date 2021/7/21
 * @Version 1.0
 * @Description
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("纷争开始了。。。");
    }

}
