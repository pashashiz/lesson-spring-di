package com.ps.springdi.injection.ex5;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

@Component
public class Parent {

    private Child child;

    public Parent() {}

    public Child getChild() {
        return child;
    }

    @Resource
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
