package com.sshen.spring6.dimap;

/**
 * @Title: Lesson
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/9 23:03
 * @Version: 1.0.0
 * @Description: 课程
 */
public class Lesson {

    private String lname;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lname='" + lname + '\'' +
                '}';
    }
}
