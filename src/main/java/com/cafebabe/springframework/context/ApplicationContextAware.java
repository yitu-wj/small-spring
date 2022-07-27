package com.cafebabe.springframework.context;

import com.cafebabe.springframework.beans.BeansException;

public interface ApplicationContextAware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
