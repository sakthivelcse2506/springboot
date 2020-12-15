package com.sakthi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakthi.spring.entity.User;
import com.sakthi.spring.service.RoleService;
import com.sakthi.spring.service.UserService;

@RestController
public class BaseController {
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
    public String home() {
        return "This is home content";
    }

	@RequestMapping("/all")
    public List<User> getUsers() {
        return userService.getUsers();
    }
	
	@PostMapping("/save")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
	
	
	
}
