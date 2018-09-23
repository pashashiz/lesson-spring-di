package com.ps.springdi.ext.ex3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static java.lang.System.currentTimeMillis;

@Aspect
@Component
public class ProfilingAspect {

    private Logger logger = LoggerFactory.getLogger("system.profiler");

    @Around("@annotation(com.ps.springdi.ext.ex3.Profiling)")
    public Object profiling(ProceedingJoinPoint pjp) throws Throwable {
        long before = currentTimeMillis();
        Object retVal = pjp.proceed();
        long after = currentTimeMillis();
        logger.info((after - before) + " ms >> " + pjp.getSignature().toLongString());
        return retVal;
    }
}
