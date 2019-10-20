package com.app.ch01;

public class Person implements PersonMBean {
    private int value;

    public void doAction() {
        System.out.println("doAction()");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
