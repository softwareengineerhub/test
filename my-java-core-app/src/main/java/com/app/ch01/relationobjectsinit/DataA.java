package com.app.ch01.relationobjectsinit;

public class DataA {

    static {
        System.out.println("static block A");
    }

    {
        System.out.println("init block A");
    }

    public DataA(){
        System.out.println("constructor A");
    }

}
