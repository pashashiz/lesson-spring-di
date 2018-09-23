package com.ps.springdi.ext.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfilerExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);
        // regular bean search
        MyService service = context.getBean(MyService.class);
        service.doWork();
    }
}
