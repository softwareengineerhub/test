package com.app.ch07.oop;

public class Parent {

    public void speak(){
        System.out.println("Parent. speak()");
    }

    public void speak(String title){
        System.out.println("Parent. speak(title):"+title);
    }

    /*public int speak(String title){
        System.out.println("Parent2. speak(title):"+title);
        return 10;
    }*/
}
