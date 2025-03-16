package com.sshen.spring6.life;

/**
 * @Title: User
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/18 23:14
 * @Version: 1.0.0
 * @Description:
 */
public class User {

    private String name;

    public User() {
        System.out.println("1：调用无参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2：设置属性值");
        this.name = name;
    }

    public void initMethod() {
        System.out.println("4：bean初始化方法");
    }

    public void destroyMethod() {
        System.out.println("7：bean对象销毁");
    }

    public void run() {
        System.out.println("6：bean对象可以使用");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
