package com.ps.springdi.lifecycle.ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.ps.springdi.Predef.println;

public class InterfaceExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);
        // regular bean search
        println(context.getBean(Bean1.class));
        context.close();
    }
}
