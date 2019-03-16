package com.app.ch01.relationobjectsinit;

public class DataB extends DataA {

    static {
        System.out.println("\tstatic block B");
    }

    {
        System.out.println("\tinit block B");
    }

    public DataB(){
        System.out.println("\tconstructor B");
    }
}
