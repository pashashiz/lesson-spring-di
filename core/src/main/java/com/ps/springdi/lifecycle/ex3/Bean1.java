package com.ps.springdi.lifecycle.ex3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// Others:
// - ApplicationContextAware
// - BeanFactoryAware
// - BeanNameAware
// - ResourceLoaderAware
// ...
@Component
public class Bean1 implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public String toString() {
        return "MyService{" +
                "applicationContext=" + applicationContext +
                '}';
    }
}
