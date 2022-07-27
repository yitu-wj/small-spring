package com.cafebabe.springframework.beans.factory;

import com.cafebabe.springframework.beans.BeansException;

public interface BeanFactoryAware extends Aware{
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
