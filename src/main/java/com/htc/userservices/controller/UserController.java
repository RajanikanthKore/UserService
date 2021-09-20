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
	
	private IUser repo;
	 
	@GetMapping("from/users/{userName}")
	User getUser(@PathVariable Long userName)
	{
		User user=null;
		user=repo.findByuserName(userName).get();
		return user;
		
	}

	@GetMapping("to/doctors/{appointmentId}")
	User getfindByuserName(@PathVariable Long userName)
	{
		User user=null;
		user=repo.findByuserName(userName).get();
		return user;
		
	}
	@PostMapping("/users")
	User createEmployee(@RequestBody User user)
	{
		return user;
		
	}


	@Autowired
	public void setRepo(IUser repo) {
		this.repo = repo;
	}
		
		
	}