package com.app.ch05.equalshashcode;

public class Main {

    public static void main(String[] args) {
        Pen pen = new Pen();
        int hashCode = pen.hashCode();
        System.out.println("pen.hashCode="+hashCode);


        Pen pen2 = new Pen();
        int hashCode2 = pen2.hashCode();
        System.out.println("pen2.hashCode="+hashCode2);

        boolean res = pen.equals(pen2);
        System.out.println(res);

        Pen pen3 = pen;
        int hashCode3 = pen3.hashCode();
        System.out.println("pen3.hashCode="+hashCode3);
        res = pen.equals(pen3);
        System.out.println(res);
        System.out.println("pen==pen3:"+(pen==pen3));
        System.out.println("--------------------------------------");
        Pen pen4 = new Pen();
        pen4.setColor("RED");
        pen4.setHeight(10);

        Pen pen5 = new Pen();
        pen5.setColor("RED");
        pen5.setHeight(10);
        System.out.println("pen5.hashCode="+pen5.hashCode());

        Pen pen6 = pen5;
        pen5.equals(pen6);

        pen5.equals("test");
        System.out.println("----------------");

        Pen pen7 = new Pen();
        pen7.setHeight(5);
        pen7.setColor("GREEN");

        Pen pen8 = new Pen();
        pen8.setHeight(5);
        pen8.setColor("GREEN");

        System.out.println("pen7.hashCode="+pen7.hashCode());
        System.out.println("pen8.hashCode="+pen8.hashCode());
        System.out.println("pen7.eqlas(pen8)=="+pen7.equals(pen8));
        System.out.println("pen7==pen8:"+(pen7==pen8));

    }
}
