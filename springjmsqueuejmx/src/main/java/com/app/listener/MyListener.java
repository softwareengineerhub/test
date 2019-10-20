package com.app.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

public class MyListener implements MessageListener {

    public void onMessage(Message message) {
        System.out.println(message);
    }
}
