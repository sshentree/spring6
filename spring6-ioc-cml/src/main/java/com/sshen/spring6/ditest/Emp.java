package com.sshen.spring6.ditest;

import java.util.Arrays;

/**
 * @Title: Emp
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/8 0:24
 * @Version: 1.0.0
 * @Description: 员工
 */
public class Emp {

    private String name;

    private Integer age;

    private Dept dept;

    private String[] loves;

    public void work() {
        dept.info();
        System.out.println(name + "emp work......" + age);
        System.out.println(Arrays.toString(loves));
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                ", loves=" + Arrays.toString(loves) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("依赖注入执行set方法");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }
}
