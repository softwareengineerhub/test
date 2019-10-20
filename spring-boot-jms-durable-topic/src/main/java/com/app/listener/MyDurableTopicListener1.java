package com.app.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class MyDurableTopicListener1 {

    @JmsListener(destination = "appTopicDurable3", containerFactory = "topicDurable1Factory")
    public void onMessage(Message message){
        System.out.println(message);
    }
}
