package com.rak.assignment.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="USERS")
public class User {
	@Id
	private Long uid;
	@Column(name = "user_name")
	private String userName;
	private String password;
	private String role;
	
	public User(){}
	
	public User(Long uid, String userName, String password, String role) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
