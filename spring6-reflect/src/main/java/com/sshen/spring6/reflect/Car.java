package com.sshen.spring6.reflect;

/**
 * @Title: Car
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/29 17:53
 * @Version: 1.0.0
 * @Description:
 */
public class Car {

    private String name;

    private Integer age;

    private String color;

    public Car() {
    }

    private Car(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private void run() {
        System.out.println("私有方法：run......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("执行setName方法");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
