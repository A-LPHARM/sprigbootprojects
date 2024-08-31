package com.example.chatapp.listener;

import com.example.chatapp.model.ChatMessage;
import com.example.chatapp.repository.ChatMessageRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @RabbitListener(queues = "chatapp.queue")
    public void receiveMessage(ChatMessage chatMessage) {
        chatMessageRepository.save(chatMessage);
    }
}
