package com.cafebabe.springframework.beans.factory;


import com.cafebabe.springframework.beans.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
