package com.rak.assignment.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rak.assignment.domain.Account;
import com.rak.assignment.service.AccountService;
import com.rak.assignment.service.UserService;
import com.rak.assignment.to.AccountTo;
import com.rak.assignment.to.UserTo;

@RestController
public class UserApiController {

	@Autowired
	private UserService userService;

	@Autowired
	private AccountService accountService;

	@CrossOrigin
	@RequestMapping(value = "/getuser/{userName}/{password}")
	public UserTo getUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		return userService.getUser(userName, password);
	}

	@CrossOrigin
	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public String createAccount(@RequestBody AccountTo accountTo) {
		String res = accountService.createAccount(accountTo);
		System.out.println("=========================: "+res);
		return res;
	}

	@CrossOrigin
	@RequestMapping(value = "/updateAccount", method = RequestMethod.POST)
	public String updateAccount(@RequestBody AccountTo accountTo) {
		return accountService.updateAccount(accountTo);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getAllAccount")
	public List<AccountTo> getAllAccount() {
		return accountService.getAllAccount();
	}

	private Account getAccount() {
		Account account = new Account();
		account.setSubmittedBy("Ram");
		account.setSubmittedDate(LocalDateTime.now());
		account.setStatus("pending");
		account.setAccountNumber("197979");
		return account;
	}
}
