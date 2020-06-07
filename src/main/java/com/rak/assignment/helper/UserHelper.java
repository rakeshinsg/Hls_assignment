package com.rak.assignment.helper;

import org.springframework.stereotype.Component;

import com.rak.assignment.domain.User;
import com.rak.assignment.to.UserTo;

@Component
public class UserHelper {
	public UserTo toUser(User user) {
		return new UserTo(user.getUserName(), user.getPassword(), user.getRole());
	}
}
