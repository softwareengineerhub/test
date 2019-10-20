package com.app.ch02.boundary;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyListenerB implements PropertyChangeListener {

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
