package com.rak.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rak.assignment.service.UserService;
import com.rak.assignment.to.UserTo;

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	@CrossOrigin
	@RequestMapping(value = "/getuser/{userName}/{password}")
	public UserTo getUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		return userService.getUser(userName, password);
	}
}
