package com.cafebabe.springframework.util;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link cn.bugstack.springframework.beans.factory.config.ConfigurableBeanFactory}.
 * <p>
 */
public interface StringValueResolver {
    String resolveStringValue(String strVal);
}
