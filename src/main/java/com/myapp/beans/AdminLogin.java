package com.myapp.beans;

import java.io.Serializable;

public class AdminLogin implements Serializable {
	private String username;
	private String password;

	public AdminLogin() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
