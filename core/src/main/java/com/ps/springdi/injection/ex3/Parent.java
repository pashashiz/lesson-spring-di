package com.ps.springdi.injection.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parent {

    private Child child;

    public Parent() {}

    public Child getChild() {
        return child;
    }

    @Autowired
    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "child=" + child +
                '}';
    }
}
