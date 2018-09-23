package com.ps.springdi.injection.ex6;

import com.ps.springdi.injection.ex6.Child;

public class Parent {

    private final Child child;

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
