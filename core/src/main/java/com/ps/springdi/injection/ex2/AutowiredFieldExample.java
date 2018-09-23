package com.ps.springdi.injection.ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.ps.springdi.Predef.println;

public class AutowiredFieldExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);
        // regular bean search
        println(context.getBean(Parent.class));
    }
}
