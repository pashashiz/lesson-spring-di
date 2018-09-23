package com.ps.springdi.ext.ex2;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @MyLogger
    private Logger logger;

    public void doWork() {
        logger.info("Doing something...");
    }
}
