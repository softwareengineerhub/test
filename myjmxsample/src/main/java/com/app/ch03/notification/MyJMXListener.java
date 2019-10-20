package com.app.ch03.notification;

import javax.management.Notification;
import javax.management.NotificationListener;

public class MyJMXListener implements NotificationListener {

    public void handleNotification(Notification notification, Object handback) {
        System.out.println(String.format("MyJMXListener.Notification=%s", notification.getMessage()));
    }

}
