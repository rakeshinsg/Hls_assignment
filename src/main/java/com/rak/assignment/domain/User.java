package com.rak.assignment.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="USERS")
public class User {
	@Id
	private Long uid;
	@Column(name = "user_name")
	private String userName;
	private String password;
	private String role;
}
