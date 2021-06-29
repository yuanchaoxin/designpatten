package com.ityuan.designpatten.prototype;

/**
 * @ClassName Sheep
 * @Package com.ityuan.designpatten.prototype
 * @Author yuanchaoxin
 * @Date 2021/6/28
 * @Version 1.0
 * @Description 浅拷贝
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Sheep() {
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return sheep;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
