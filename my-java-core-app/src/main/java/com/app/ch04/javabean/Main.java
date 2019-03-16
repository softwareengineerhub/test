package com.app.ch04.javabean;

public class Main {

    public static void main(String[] args) {
        Device device = new Device();
        device.setName("HTC");
        device.setPrice(1000);
        device.setYear(2018);

        System.out.println(device.getName());
        System.out.println(device.getPrice());
        System.out.println(device.getYear());

        //System.out.println(device.toString());
        System.out.println(device);

        Device device2 = new Device();
        System.out.println(device2);

    }
}
