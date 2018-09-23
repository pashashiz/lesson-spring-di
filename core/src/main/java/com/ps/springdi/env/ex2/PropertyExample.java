package com.ps.springdi.env.ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.ps.springdi.Predef.println;

public class PropertyExample {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);
        // regular bean search
        println(context.getBean(Bean.class));
    }
}
