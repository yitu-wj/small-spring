package com.cafebabe.springframework.beans.factory;

import com.cafebabe.springframework.beans.BeansException;
import com.cafebabe.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.cafebabe.springframework.beans.factory.config.BeanDefinition;
import com.cafebabe.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
