package com.ps.springdi.context.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }
}
