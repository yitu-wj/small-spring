package com.cafebabe.springframework.context;

import com.cafebabe.springframework.beans.factory.HierarchicalBeanFactory;
import com.cafebabe.springframework.beans.factory.ListableBeanFactory;
import com.cafebabe.springframework.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
