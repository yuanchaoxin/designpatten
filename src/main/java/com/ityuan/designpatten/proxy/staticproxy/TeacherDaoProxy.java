package com.ityuan.designpatten.proxy.staticproxy;

/**
 * @ClassName TeacherDaoProxy
 * @Package com.ityuan.designpatten.proxy.staticproxy
 * @Author yuanchaoxin
 * @Date 2021/7/21
 * @Version 1.0
 * @Description
 */
public class TeacherDaoProxy implements ITeacherDao {

    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("目标方法调用前。。。");
        teacherDao.teach();
        System.out.println("目标方法调用后。。。");
    }

}
