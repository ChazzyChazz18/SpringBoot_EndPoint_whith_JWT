package com.example.restful_api_demo.Models;

public class Autentication {

    private String username;
    private String password;
	private String token;

    public String getToken() {
		return token;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    
}
