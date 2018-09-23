package com.ps.springdi.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private HelloService service;

    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length == 1) {
            service.hello(args[0]);
        } else {
            throw new IllegalAccessException("Expected 1 argument");
        }
    }
}
