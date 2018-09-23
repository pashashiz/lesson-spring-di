package com.ps.springdi.injection.ex6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public Parent parent(Child child) {
        return new Parent(child);
    }
}
