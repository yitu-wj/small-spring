package com.cafebabe.springframework.beans.factory;

public interface DisposableBean {
    void destroy() throws Exception;
}
