package com.cafebabe.springframework.core.conver.support;

import com.cafebabe.springframework.core.conver.converter.Converter;
import com.cafebabe.springframework.core.conver.converter.ConverterFactory;
import com.cafebabe.springframework.util.NumberUtils;

/**
 * Converts from a String any JDK-standard Number implementation.
 */
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {
    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }
    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }
}
