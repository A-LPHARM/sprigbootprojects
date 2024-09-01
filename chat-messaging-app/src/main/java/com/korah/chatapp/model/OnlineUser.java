package com.korah.chatapp.model;

import java.util.UUID;

import jakarta.persistence.Id;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("online_user")
public class OnlineUser {

	@Id
	private String id;
	private String username;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

}
