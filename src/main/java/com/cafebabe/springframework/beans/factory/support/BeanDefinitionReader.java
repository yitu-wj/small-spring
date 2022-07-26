package com.cafebabe.springframework.beans.factory.support;

import com.cafebabe.springframework.beans.BeansException;
import com.cafebabe.springframework.core.io.Resource;
import com.cafebabe.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
