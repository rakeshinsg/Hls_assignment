package com.rak.assignment.service;

import com.rak.assignment.to.UserTo;

public interface UserService {
	public UserTo getUser(String userName, String password);
}
