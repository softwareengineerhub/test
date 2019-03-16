package com.app.ch03.access.modificators.car;

public class Car {
    public String name;
    protected String color;
    int year;
    private int price;

    public void printPrice(){
        System.out.println("price");
    }
}
