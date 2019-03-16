package com.app.ch01.relationobjectsinit;

public class DataC extends DataB {

    static {
        System.out.println("\t\tstatic block C");
    }

    {
        System.out.println("\t\tinit block C");
    }

    public DataC(){
        System.out.println("\t\tconstructor C");
    }
}


