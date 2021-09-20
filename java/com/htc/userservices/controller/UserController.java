package com.htc.userservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.userservice.persistance.IUser;
import com.htc.userservices.entity.User;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	IUser iuser;
	
	@PostMapping("/adduser") 
	public UserService createNewUser(@RequestBody UserService userService) {
		   
		 return IUser.save(userService);
	}
		
		
	}