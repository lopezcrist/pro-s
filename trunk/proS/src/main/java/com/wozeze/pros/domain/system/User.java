package com.wozeze.pros.domain.system;

import com.wozeze.pros.domain.BaseDomain;

public class User extends BaseDomain{
	
	private String password;
	private String passwordRe;
	private String email;

	public String getPasswordRe() {
		return passwordRe;
	}

	public void setPasswordRe(String passwordRe) {
		this.passwordRe = passwordRe;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
