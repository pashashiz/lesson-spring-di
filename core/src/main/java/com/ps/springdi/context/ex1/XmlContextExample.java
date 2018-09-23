package com.ps.springdi.context.ex1;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import static com.ps.springdi.Predef.println;

public class XmlContextExample {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("context/ex1/context.xml");
        context.refresh();
        // regular bean search
        println(context.getBean(Bean1.class));
        println(context.getBean("bean1"));
    }
}
