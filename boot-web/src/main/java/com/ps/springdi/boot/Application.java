package com.ps.springdi.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    private HelloController service;

    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }
}
