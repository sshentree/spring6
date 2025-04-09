package com.sshen.spring6.validator;

/**
 * @Title: User
 * @Author: shendez@163.com
 * @CreateTime: 2025/4/2 20:05
 * @Version: 1.0.0
 * @Description:
 */
public class User {

    private String userName;

    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
