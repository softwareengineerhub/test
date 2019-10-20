package com.app.ch02.boundary;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.addListener(new MyListenerA());
        user.addListener(new MyListenerB());
        user.setName("A");
        user.setName("B");
    }
}
