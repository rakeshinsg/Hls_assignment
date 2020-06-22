package com.rak.assignment.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rak.assignment.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
	
}
