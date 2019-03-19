package com.app.ch10.boxing.unboxing;

public class Main {

    public static void main(String[] args) {
        Integer i  =1;
        int j = 2;
        i++;
        j++;
        i=i+j;


        int a = 1;
        int b = 2;

        int res = add(a, b);
        System.out.println(res);
        System.out.println("--------------------");
        byte a1 = 1;
        byte b1 = 2;
        add(a1, b1);

        short a2 = 1;
        short b2 = 2;
        add(a2, b2);

        /*long a3 = 1;
        long b3 = 2;
        add(a3, b3);*/

        Integer a4 = new Integer(1);
        Integer b4 = 2;
        add(a4, b4);


        Byte a5 = new Byte((byte)1);
        Byte b5 = new Byte((byte)2);
        add(a5, b5);

        Short a6 = new Short((short)1);
        Short b6 = new Short((short)2);

        /*Long a7 = new Long((short)1);
        Long b7 = new Long((short)2);
        add(a7, b7);*/

        System.out.println("-----------------");
        int c1 = 1;
        int d1 = 2;
        add2(c1, d1);

        Integer c2 = 1;
        Integer d2 = new Integer(2);
        add2(c2, d2);

        /*byte c3 = 1;
        byte d3 = 2;
        add2(c3, d3);*/

    }


    private static int add(int a, int b){
        //Integer res = a+b;
        int res = a+b;
        return res;
        //return Integr
    }

    private static int add2(Integer a, Integer b){
        //Integer res = a+b;
        int res = a+b;
        return res;
        //return Integr
    }




}
