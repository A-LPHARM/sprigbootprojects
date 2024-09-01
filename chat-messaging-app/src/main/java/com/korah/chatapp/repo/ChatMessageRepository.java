package com.korah.chatapp.repo;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.korah.chatapp.model.ChatMessage;

public interface ChatMessageRepository extends CassandraRepository<ChatMessage, UUID> {

}
