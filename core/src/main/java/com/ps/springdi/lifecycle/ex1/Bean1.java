package com.ps.springdi.lifecycle.ex1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static com.ps.springdi.Predef.println;

@Component
public class Bean1 {

    @PostConstruct
    public void init() {
        println("init");
    }

    @PreDestroy
    public void destroy() {
        println("destroy");
    }
}
