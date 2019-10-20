package com.app.ch02.boundary;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyListenerA implements PropertyChangeListener {

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Change detected!!!");
    }
}
