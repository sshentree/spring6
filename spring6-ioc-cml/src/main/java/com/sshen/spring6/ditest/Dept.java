package com.sshen.spring6.ditest;

import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @Title: Dept
 * @Author: shendez@163.com
 * @CreateTime: 2024/12/8 0:21
 * @Version: 1.0.0
 * @Description: 部门
 */
public class Dept {

    private String name;

    private List<Emp> emps;

    public void info() {
        System.out.println("部门名称：" + name);
        if (!CollectionUtils.isEmpty(emps)) {
            for (Emp emp : emps) {
                System.out.println(emp);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}
