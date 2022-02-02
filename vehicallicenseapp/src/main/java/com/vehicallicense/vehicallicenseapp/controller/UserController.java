package com.vehicallicense.vehicallicenseapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicallicense.vehicallicenseapp.entity.User;
import com.vehicallicense.vehicallicenseapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public User creatUser(@Valid @RequestBody User user)
	{
		return userService.creatUser(user);
	}
	
	@GetMapping("/users/{userId}")
	public User getUserById( @PathVariable int userId)
	{
		return userService.getUserById(userId);
	}
	
	@DeleteMapping("/users/{userId}")
	public String deleteUserById( @PathVariable int userId) {
		return userService.deleteUserById(userId);
	}
	
	@PutMapping("/users/{userId}")
	public User updateAddress( @PathVariable int userId,@Valid @RequestBody User obj)
	{
		return userService.updateUser(userId,obj);
	}
}

