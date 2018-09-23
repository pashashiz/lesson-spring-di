package com.ps.springdi.ext.ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.ps.springdi.Predef.println;

public class LoggerExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(RootConfig.class);
        // regular bean search
        MyService service = context.getBean(MyService.class);
        service.doWork();
    }
}
