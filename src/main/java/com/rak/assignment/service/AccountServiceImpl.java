package com.rak.assignment.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.rak.assignment.domain.Account;
import com.rak.assignment.domain.User;
import com.rak.assignment.helper.AccountHelper;
import com.rak.assignment.repository.AccountRepository;
import com.rak.assignment.repository.UserRepository;
import com.rak.assignment.to.AccountTo;

@Service
public class AccountServiceImpl implements AccountService {

	private final AccountRepository accountRepository;
	private final AccountHelper accountHelper;
	private final UserRepository userRepository;

	public AccountServiceImpl(AccountRepository accountRepository, AccountHelper accountHelper,
			UserRepository userRepository) {
		this.accountRepository = accountRepository;
		this.accountHelper = accountHelper;
		this.userRepository = userRepository;
	}

	@Override
	public String createAccount(AccountTo accountTo) {
		return saveOrUodateAccount(accountTo, null, "Created");
	}
	
	@Override
	public String updateAccount(AccountTo accountTo) {
		User user = userRepository.getUserByUserName(accountTo.getApprovedBy());
		return saveOrUodateAccount(accountTo, user, "Updated");
	}
	
	@Override
	public List<AccountTo> getAllAccount() {
		 return accountHelper.fromAccount(accountRepository.findAll());
	}

	private String saveOrUodateAccount(AccountTo accountTo, User user, String msg) {
		if(accountTo != null) {
			if(user == null) {
				Account account = accountRepository.save(accountHelper.toAccount(accountTo, user));
				return account.getRequestId() == null ? null : "Account "+msg; 
			} else {
				accountRepository.deleteById(UUID.fromString(accountTo.getReruestId()));
				Account account = accountRepository.save(accountHelper.toAccount(accountTo, user));
				return account.getRequestId() == null ? null : "Account "+msg; 
			}
			
		} else {
			return null;
		}
	}
}