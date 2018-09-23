package com.ps.springdi.ext.ex2;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Arrays.stream(bean.getClass().getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(MyLogger.class))
                .forEach(field -> {
                    try {
                        field.setAccessible(true);
                        field.set(bean, LoggerFactory.getLogger(bean.getClass()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
        return bean;
    }
}
