package com.sakthi.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakthi.spring.entity.User;
import com.sakthi.spring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	
}
