package com.ps.springdi.injection.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parent {

    @Autowired
    private Child child;

    public Parent() {}

    public Child getChild() {
        return child;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "child=" + child +
                '}';
    }
}
