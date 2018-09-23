package com.ps.springdi.ext.ex3;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Profiling
    public void doWork() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
