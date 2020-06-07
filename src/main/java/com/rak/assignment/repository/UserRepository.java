package com.rak.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rak.assignment.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User getUserByUserNameAndPassword(String uname, String pwd);
}
