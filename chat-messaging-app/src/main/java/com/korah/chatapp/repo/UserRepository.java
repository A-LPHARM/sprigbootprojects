package com.korah.chatapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korah.chatapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findUserByUsername(String username);
}
