package com.ps.springdi.context.ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.ps.springdi.Predef.println;

public class JavaConfigExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);
        // regular bean search
        println(context.getBean(Bean1.class));
        println(context.getBean("bean-x"));
    }
}
