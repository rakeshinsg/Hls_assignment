package com.rak.assignment.service;

import org.springframework.stereotype.Service;

import com.rak.assignment.domain.User;
import com.rak.assignment.helper.UserHelper;
import com.rak.assignment.repository.UserRepository;
import com.rak.assignment.to.UserTo;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final UserHelper userHelper;

	public UserServiceImpl(UserRepository userRepository, UserHelper userHelper) {
		this.userRepository = userRepository;
		this.userHelper = userHelper;
	}

	@Override
	public UserTo getUser(String userName, String password) {
		User user = userRepository.getUserByUserNameAndPassword(userName, password);
		return userHelper.toUser(user);
	}
}