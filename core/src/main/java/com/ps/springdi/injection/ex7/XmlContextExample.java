package com.ps.springdi.injection.ex7;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

import static com.ps.springdi.Predef.println;

public class XmlContextExample {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("injection/ex7/context.xml");
        context.refresh();
        // regular bean search
        println(context.getBean(Parent.class));
    }
}
