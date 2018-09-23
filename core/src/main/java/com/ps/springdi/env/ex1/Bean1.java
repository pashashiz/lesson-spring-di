package com.ps.springdi.env.ex1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {

    private String database;
    private String home;

    public Bean1(@Value("${database}") String database, @Value("${java.home}") String home) {
        this.database = database;
        this.home = home;
    }

    @Override
    public String toString() {
        return "MyService{" +
                "database='" + database + '\'' +
                ", home='" + home + '\'' +
                '}';
    }
}
