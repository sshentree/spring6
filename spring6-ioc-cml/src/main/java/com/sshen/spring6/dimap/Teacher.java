package com.sshen.spring6.dimap;

/**
 * @Title: Teacher
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/8 22:19
 * @Version: 1.0.0
 * @Description: 老师
 */
public class Teacher {

    private String tid;

    private String tname;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

}
