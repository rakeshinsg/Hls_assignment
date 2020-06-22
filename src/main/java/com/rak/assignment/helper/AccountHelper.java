package com.rak.assignment.helper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rak.assignment.domain.Account;
import com.rak.assignment.domain.User;
import com.rak.assignment.to.AccountTo;

@Component
public class AccountHelper {
	public Account toAccount(AccountTo accountTo, User user) {
		Account account = new Account();
		account.setSubmittedBy(accountTo.getSubmittedBy());
		account.setSubmittedDate(LocalDateTime.now());
		account.setAccountNumber(accountTo.getAccountNumber());
		if(user != null) {
			if(user.getRole().equalsIgnoreCase("Admin") && !user.getUserName().equals(accountTo.getSubmittedBy())) {
				account.setStatus(accountTo.getStatus());
				account.setApprovedBy(accountTo.getApprovedBy());
				account.setApprovalDate(LocalDateTime.now());
			} else {
				account.setStatus("Cancelled");
				account.setApprovedBy(null);
			}
		} else {
			account.setStatus(accountTo.getStatus());
			account.setApprovedBy(accountTo.getApprovedBy());
			account.setApprovalDate(accountTo.getApprovalDate());
		}
		return account;
	}

	public List<AccountTo> fromAccount(List<Account> accountList) {
		List<AccountTo> accountToList = new ArrayList<AccountTo>();
		accountList.forEach(account -> {
			accountToList.add(new AccountTo(account.getRequestId().toString(), account.getSubmittedBy(),account.getSubmittedDate(),
					account.getApprovedBy(), account.getApprovalDate(), account.getStatus(), account.getAccountNumber()));
			
		});
		return accountToList;
	}
}
