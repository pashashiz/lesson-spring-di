package com.ps.springdi.lifecycle.ex2;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import static com.ps.springdi.Predef.println;

// Others:
// - DisposableBean
// - LifecycleProcessor
// - etc... see doc
@Component
public class Bean1 implements SmartLifecycle {

    @Override
    public void start() {}

    @Override
    public void stop() {
        println("destroy");
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
