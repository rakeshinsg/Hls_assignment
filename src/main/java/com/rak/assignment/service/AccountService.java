package com.rak.assignment.service;

import java.util.List;

import com.rak.assignment.to.AccountTo;

public interface AccountService {
	public String createAccount(AccountTo account);
	public String updateAccount(AccountTo account);
	public List<AccountTo> getAllAccount();
}
