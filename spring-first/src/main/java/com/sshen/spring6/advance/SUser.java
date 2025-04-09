package com.sshen.spring6.advance;

import java.util.Arrays;
import java.util.List;

/**
 * @Title: SUser
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/30 23:03
 * @Version: 1.0.0
 * @Description:
 */
public class SUser {

    private String[] userNames;

    private Integer age;

    public String[] getUserNames() {
        return userNames;
    }

    public void setUserNames(String...  userName) {
        this.userNames = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * xml配置文件中properties中的name属性值，找的是setter方法中的属性名称
     * 例如下面的setUserName方法，nam属性值就是userName
     *
     * @param userName
     */
    public void setUserName(String... userName) {
        this.userNames = userName;
    }

    public void setAAA(String... userName) {
        this.userNames = userName;
    }

    public void seBBB(String... userName) {
        this.userNames = userName;
    }

    @Override
    public String toString() {
        return "SUser{" +
                "userNames=" + Arrays.toString(userNames) +
                ", age=" + age +
                '}';
    }
}
