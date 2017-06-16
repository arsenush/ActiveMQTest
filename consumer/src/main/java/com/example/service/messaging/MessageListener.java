package com.example.service.messaging;

import org.springframework.messaging.Message;

public interface MessageListener {
    void onMessage(Message<String> message);
}
