package com.app.ch03.access.modificators;

import com.app.ch03.access.modificators.car.Car;

public class Main {

    /*
    public
    protected
    default (empty)
    private
     */

    public static void main(String[] args) {
        Car car = new Car();
        car.name="MyCar";
        System.out.println(car.name);
       // car.color="White";
    }

}
