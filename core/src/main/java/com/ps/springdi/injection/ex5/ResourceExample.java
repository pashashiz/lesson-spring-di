package com.ps.springdi.injection.ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.ps.springdi.Predef.println;

public class ResourceExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);
        // regular bean search
        println(context.getBean(Parent.class));
    }
}
