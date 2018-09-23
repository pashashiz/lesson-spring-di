package com.ps.springdi.injection.ex8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

    @Bean
    public Child bill() {
        return new Bill();
    }

    @Bean
    public Child bob() {
        return new Bill();
    }

    @Bean
    public Parent parent(@Qualifier("bill") Child child) {
        return new Parent(child);
    }
}
