package com.sakthi.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakthi.spring.entity.Role;
import com.sakthi.spring.entity.User;
import com.sakthi.spring.repository.RoleRepository;
import com.sakthi.spring.repository.UserRepository;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public List<Role> getRoles() {
        return roleRepository.findAll();
    }

	public Role createRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }
	
	public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
	
}
