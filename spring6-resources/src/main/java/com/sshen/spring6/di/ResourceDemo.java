package com.sshen.spring6.di;

import org.springframework.core.io.Resource;

/**
 * @Title: ResourceDemo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/20 23:15
 * @Version: 1.0.0
 * @Description:
 */
public class ResourceDemo {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void run() {
        System.out.println(resource.getFilename());
    }
}
