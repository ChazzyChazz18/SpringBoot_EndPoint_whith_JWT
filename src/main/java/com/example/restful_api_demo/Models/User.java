package com.example.restful_api_demo.Models;

public class User {

    private long id;
	private String name;
    private String lastName;
    private String address;

	public User(long id, String name, String lastName, String address) {
		this.id = id;
		this.name = name;
        this.lastName = lastName;
        this.address = address;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

    public String getLastName() {
		return lastName;
	}

    public String getAddress() {
		return address;
	}
    
}
