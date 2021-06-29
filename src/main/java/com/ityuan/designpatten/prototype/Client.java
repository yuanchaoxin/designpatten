package com.ityuan.designpatten.prototype;

/**
 * @ClassName Client
 * @Package com.ityuan.designpatten.prototype
 * @Author yuanchaoxin
 * @Date 2021/6/28
 * @Version 1.0
 * @Description
 */
public class Client {
    public static void main(String[] args) {

        Sheep sheep = new Sheep("小羊", 1, "白色");
        System.out.println("原生的：" +sheep);

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println("克隆1：" +sheep1);
        System.out.println("克隆2：" +sheep2);
        System.out.println("克隆3：" +sheep3);
        System.out.println("克隆4：" +sheep4);
    }
}
