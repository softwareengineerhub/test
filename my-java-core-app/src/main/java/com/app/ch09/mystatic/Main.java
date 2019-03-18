package com.app.ch09.mystatic;

public class Main {

    public static void main(String[] args) {
        String str = "dsfsdf";
        boolean res=MyUtils.isEmpty(str);
        System.out.println(res);
        Math.abs(-1);

        System.out.println("-----------static fields-----------");
        MyComputer c1 = new MyComputer();
        c1.setName("Comp1");
        c1.price=10;

        MyComputer c2 = new MyComputer();
        c2.setName("Comp2");
        c2.price=20;

        System.out.println("c1.price="+c1.price);

    }
}
