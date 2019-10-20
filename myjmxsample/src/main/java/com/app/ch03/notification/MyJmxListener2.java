package com.app.ch03.notification;

import javax.management.Notification;
import javax.management.NotificationListener;

public class MyJmxListener2 implements NotificationListener {

    public void handleNotification(Notification notification, Object handback) {
        System.out.println(String.format("MyJMXListener.Notification=%s", notification.getMessage()));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
