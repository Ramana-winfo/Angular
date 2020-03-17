package com.bank.bankapplication.view;

public class UserView {
	private String name;
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
		return "UserView [ name=" + name + "]";
	}

	


}
