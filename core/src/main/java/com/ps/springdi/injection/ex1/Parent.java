package com.ps.springdi.injection.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parent {

    private final Child child;

    @Autowired
    public Parent(Child child) {
        this.child = child;
    }

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
