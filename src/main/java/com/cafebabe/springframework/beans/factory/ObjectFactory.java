package com.cafebabe.springframework.beans.factory;

import com.cafebabe.springframework.beans.BeansException;

/**
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 */
public interface ObjectFactory<T> {
    T getObject() throws BeansException;
}
