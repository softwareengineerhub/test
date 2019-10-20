package com.app.ch02.boundary;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class User {
    private String name;
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        changeSupport.firePropertyChange("name", this.name, name);
        this.name = name;
    }

    public void addListener(PropertyChangeListener changeListener){
        changeSupport.addPropertyChangeListener(changeListener);
    }

    public void removeListener(PropertyChangeListener changeListener){
        changeSupport.removePropertyChangeListener(changeListener);
    }
}
