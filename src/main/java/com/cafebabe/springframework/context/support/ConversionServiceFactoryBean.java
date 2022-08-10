package com.cafebabe.springframework.context.support;

import com.cafebabe.springframework.beans.factory.FactoryBean;
import com.cafebabe.springframework.beans.factory.InitializingBean;
import com.cafebabe.springframework.core.conver.ConversionService;
import com.cafebabe.springframework.core.conver.converter.Converter;
import com.cafebabe.springframework.core.conver.converter.ConverterFactory;
import com.cafebabe.springframework.core.conver.converter.ConverterRegistry;
import com.cafebabe.springframework.core.conver.converter.GenericConverter;
import com.cafebabe.springframework.core.conver.support.DefaultConversionService;
import com.cafebabe.springframework.core.conver.support.GenericConversionService;

import java.util.Set;

/**
 * A factory providing convenient access to a ConversionService configured with
 * converters appropriate for most environments. Set the
 * setConverters "converters" property to supplement the default converters.
 *
 * 提供创建 ConversionService 工厂
 *
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    private Set<?> converters;

    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }

}
