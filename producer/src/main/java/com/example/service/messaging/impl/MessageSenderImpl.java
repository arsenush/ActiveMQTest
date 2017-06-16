package com.example.service.messaging.impl;

import com.example.service.messaging.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderImpl implements MessageSender {

    private JmsTemplate jmsTemplate;

    @Autowired
    public MessageSenderImpl(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void send(String message) {
        jmsTemplate.convertAndSend(message);
    }
}
