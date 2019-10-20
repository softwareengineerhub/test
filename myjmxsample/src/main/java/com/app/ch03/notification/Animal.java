package com.app.ch03.notification;

import javax.management.*;

public class Animal implements AnimalMBean, NotificationBroadcaster {
    private String name;
    private NotificationBroadcasterSupport support = new NotificationBroadcasterSupport();
    private long seqNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        support.sendNotification(new AttributeChangeNotification(this, seqNumber++, System.currentTimeMillis(), String.format("%s.%s-->%s", "Name", this.name, name), "Name", String.class.getName(), this.name, name));

        this.name = name;
    }

    public NotificationBroadcasterSupport getSupport() {
        return support;
    }

    public void setSupport(NotificationBroadcasterSupport support) {
        this.support = support;
    }

    public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) throws IllegalArgumentException {
        support.addNotificationListener(listener, filter, handback);
    }

    public void removeNotificationListener(NotificationListener listener) throws ListenerNotFoundException {
        support.removeNotificationListener(listener);
    }

    public MBeanNotificationInfo[] getNotificationInfo() {
        return new MBeanNotificationInfo[0];
    }
}
