package com.example.service.messaging.impl;

import com.example.repository.StorageRepository;
import com.example.service.messaging.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageListenerImpl implements MessageListener {

    private StorageRepository storageRepository;

    @Autowired
    public MessageListenerImpl(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    @JmsListener(destination = "test1")
    public void onMessage(Message<String> message) {
        storageRepository.addData(message.getPayload());
    }
}
