package com.example.chatapp.controller;

import com.example.chatapp.model.ChatMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public ChatController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/send")
    public void sendChatMessage(@RequestBody String message) {
        // Send the message to the exchange
        rabbitTemplate.convertAndSend("chatapp.exchange", "chatapp.routingKey", message);
    }
}