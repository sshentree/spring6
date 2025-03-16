package com.sshen.spring6.simple;

/**
 * @Title: User
 * @Author: shendez@163.com
 * @CreateTime: 2024/11/26 23:10
 * @Version: 1.0.0
 * @Description:
 */
public class User {

    private String name;

    public User() {
        System.out.println("开始执行无参构造器");
    }

    public User(String name) {
        System.out.println("开始执行有参构造器");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("add.....");
    }
}
