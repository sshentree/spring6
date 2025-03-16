package com.sshen.spring6.dimap;

import java.util.List;
import java.util.Map;

/**
 * @Title: Student
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/8 22:19
 * @Version: 1.0.0
 * @Description: 学生
 */
public class Student {

    List<Lesson> lessons;

    private Map<String, Teacher> teacherMap;

    private String sid;

    private String sname;

    public Student() {
    }

    public Student(String sid) {
        this.sid = sid;
    }

    public Student(List<Lesson> lessons, Map<String, Teacher> teacherMap, String sid, String sname) {
        this.lessons = lessons;
        this.teacherMap = teacherMap;
        this.sid = sid;
        this.sname = sname;
    }

    public void run() {
        System.out.println("学生编号：" + sid + "；学生名称：" + sname);
        System.out.println(teacherMap);
        System.out.println(lessons);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
