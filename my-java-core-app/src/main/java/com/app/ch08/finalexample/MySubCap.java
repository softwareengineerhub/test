package com.app.ch08.finalexample;

public class MySubCap extends  MyCap {

    private final String name = "inline";
    private final String title;
    private final String value;

    {
        title = "init block";
    }

    public MySubCap() {
        value = "constructor";
    }

    /*public void speak(){

    }*/

    public void changeName(){
        //name = "ghdbhfdbg";
    }
}
