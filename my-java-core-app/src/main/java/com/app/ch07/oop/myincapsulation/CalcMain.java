package com.app.ch07.oop.myincapsulation;

public class CalcMain {

    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        float res = myCalc.add(1,2);
        System.out.println(res);
    }
}
