package com.bank.bankapplication.view;

import com.bank.bankapplication.entity.UserDetails;

public class UserView 
{    
	
	private int id;
	private String name;
	private UserDetails userDetails;
	
	public UserView(int id, String name, UserDetails userDetails) {
		super();
		this.id = id;
		this.name = name;
		this.userDetails = userDetails;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public UserView( String name) {
		super();
		this.name = name;
	}
	public UserView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserView [id=" + id + ", name=" + name + ", userDetails=" + userDetails + "]";
	}
	



}
