package com.cafebabe.springframework.context;

import com.cafebabe.springframework.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext{
    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
