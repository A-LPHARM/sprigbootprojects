package com.example.chatapp.config; // Ensure this matches your package structure

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue chatAppQueue() {
        return new Queue("chatapp.queue", false); // false means the queue is non-durable
    }
}
