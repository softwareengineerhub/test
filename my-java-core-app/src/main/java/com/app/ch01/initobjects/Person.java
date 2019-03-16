package com.app.ch01.initobjects;

public class Person {
    public String name;
    public int age;


    static {
        System.out.println("{static init block1}");
    }


    {
        System.out.println("{init block1}");
    }


    {
        System.out.println("{init block2}");
    }

    static {
        System.out.println("{static init block2}");
    }

    public Person() {
       System.out.println("Constructor()");
    }

    public Person(String personName, int personAge) {
        System.out.println("Constructor(name, age)");
        name=personName;
        age=personAge;
    }

    {
        System.out.println("{init block3}");
    }


    public void speak() {
        System.out.println("speak()");
    }


    static {
        System.out.println("{static init block3}");
    }
}
