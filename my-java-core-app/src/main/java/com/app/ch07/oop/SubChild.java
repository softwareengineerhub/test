package com.app.ch07.oop;

public class SubChild extends Child {

    //@Override
    public void speak(int value) {
        /*long start = System.currentTimeMillis();
        super.speak(value);
        System.out.println(System.currentTimeMillis()-start);*/
        System.out.println("SubChild.speak(int value)");
    }

    @Override
    public void speak() {
        //super.speak();
        System.out.println("SubChild.speak()");
    }

    @Override
    public void speak(String title) {
        //super.speak(title);
        System.out.println("SubChild.speak(String title)");
    }


    public void subChildMethod(){

    }
}
