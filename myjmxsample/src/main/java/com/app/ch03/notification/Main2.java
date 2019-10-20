package com.app.ch03.notification;

import com.app.ch01.Person;

import javax.management.*;

public class Main2 {

    public static void main(String[] args) throws Exception {
        MBeanServer server = MBeanServerFactory.createMBeanServer();
        ObjectName key = new ObjectName("animal:key=value");
        Animal animal = new Animal();
        server.registerMBean(animal, key);
        server.addNotificationListener(key, new MyJMXListener(), null, null);
        server.addNotificationListener(key, new MyJmxListener2(), null, null);
        System.out.println("------------------------------------------");

      //  animal.setName("A");
        Attribute attribute = new Attribute("Name", "A");
        server.setAttribute(key, attribute);

        attribute = new Attribute("Name", "B");
        server.setAttribute(key, attribute);

    }
}
