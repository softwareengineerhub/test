package com.app.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class MyDurableTopicListener2 {

    @JmsListener(destination = "appTopicDurable3", containerFactory = "topicDurable2Factory")
    public void onMessage(Message message){
        System.out.println(message);
    }
}
