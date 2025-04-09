package com.sshen.spring6.di;

/**
 * @Title: ResourceDemo1
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/20 23:28
 * @Version: 1.0.0
 * @Description:
 */
public class ResourceDemo1 {

    private String resource;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public void run() {
        System.out.println(resource);
    }
}
