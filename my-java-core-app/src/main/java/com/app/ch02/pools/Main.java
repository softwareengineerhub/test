package com.app.ch02.pools;

public class Main {

    public static void main(String[] args) {
        Integer a = 7;
        Integer b = 7;

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println("------------");

        Integer c = new Integer(7);
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println("------------");
        Integer d = -128;
        Integer e = -128;
        System.out.println(d==e);

    }
}
