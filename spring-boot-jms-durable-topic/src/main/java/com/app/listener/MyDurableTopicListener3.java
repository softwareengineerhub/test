package com.app.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class MyDurableTopicListener3 {

    @JmsListener(destination = "appTopicDurable3", containerFactory = "topicDurable3Factory")
    public void onMessage(Message message){
        System.out.println(message);
    }
}
