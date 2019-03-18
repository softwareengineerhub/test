package com.app.ch07.oop;

/*

1) Polimorphism
2) incapsulation
3) inheritance


1) Polimorphism:
Возможность использования методов, которые имеют одинаковое название, но отличаются параметрами ,
в классе или группой классов, связанных отношением наследования

1.1) Статический полиморфизм - overloading

*/
public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.speak();
        parent.speak("Hello");

        Child child = new Child();
        child.speak();
        child.speak("Child");
        child.speak(10);

        SubChild subChild = new SubChild();
        subChild.speak();
        subChild.speak("TEST");
        subChild.speak(10);

        System.out.println("-------------------------");
        /*IS-A

        Child IS-A Parent
        SubChild IS-A Child
        SubChild IS-A Parent

        */

        Parent p0 = new Child();
        //Child child0 = new Parent();
        Parent p1 = new SubChild();

        p0.speak();
        p1.speak();
        //p1.subChildMethod();
        System.out.println("--------------------------");
        Parent parentItem = getParent(2);
        parentItem.speak();

    }


    public static Parent getParent(int type){
        switch (type){
            case 0:
                return new Parent();
            case 1:
                return new Child();
            case 2:
                return new SubChild();
            //case 3:
            //    return new Object();
            default:
                return null;
        }
    }




}
