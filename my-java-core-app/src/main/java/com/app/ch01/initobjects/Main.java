package com.app.ch01.initobjects;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("------------person---------------");
        Person person = new Person();
        System.out.println("---------------------------");
        System.out.println("------------person2---------------");
        Person person2 = new Person();
        System.out.println("---------------------------");
        System.out.println("------------person3---------------");
        Person person3 = new Person();
        System.out.println("---------------------------");
        System.out.println("------------person4---------------");
        Person person4 = new Person("Person4", 4);
        System.out.println("---------------------------");
        System.out.println("-----------------------------");
        person.speak();
        person.age=10;
        person.name="User";
        System.out.println("name="+person.name);
        System.out.println("age="+person.age);
        System.out.println("---------------Reflaction------------");
       // Person person5= (Person) Class.forName("com.app.ch01.initobjects.User").newInstance();
        Person person5= (Person) Class.forName("com.app.ch01.initobjects.Person").newInstance();
    }
}
