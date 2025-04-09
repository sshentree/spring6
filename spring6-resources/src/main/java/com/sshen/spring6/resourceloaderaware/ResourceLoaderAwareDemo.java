package com.sshen.spring6.resourceloaderaware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * @Title: ResourceLoaderAwareDemo
 * @Author: shendez@163.com
 * @CreateTime: 2025/3/20 22:52
 * @Version: 1.0.0
 * @Description:
 */
public class ResourceLoaderAwareDemo implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("将Spring容器（ApplicationContext）作为参数传递！");
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
