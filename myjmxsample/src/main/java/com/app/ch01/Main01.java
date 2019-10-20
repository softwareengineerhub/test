package com.app.ch01;

import javax.management.*;
import java.util.ArrayList;

public class Main01 {

    public static void main(String[] args) throws Exception {
        //ArrayList<MBeanServer> list = MBeanServerFactory.findMBeanServer("pid 12760");
        //System.out.println(list.size());

        MBeanServer server = MBeanServerFactory.createMBeanServer();
        ObjectName key = new ObjectName("person:key=value");
        Person person = new Person();
        server.registerMBean(person, key);
        System.out.println("------------------------------------------");

        //Remote reflection

        //Get by key
        Object value = server.getAttribute(key, "Value");
        System.out.println("Read by key"+value);


        //Set by key
        //person.setValue(3000);
        System.out.println("Set value to 3000");
        Attribute attr = new Attribute("Value", 3000);
        server.setAttribute(key, attr);

        value = server.getAttribute(key, "Value");
        System.out.println("Read by key"+value);

        //Remote method call
//Object returnValue = server.invoke(key, "doOperation", new Object[]{1000}, new String[]{"int"});
        //person.doAction();
        server.invoke(key, "doAction", null, null);
        //Thread.sleep(Integer.MAX_VALUE);

    }
}
