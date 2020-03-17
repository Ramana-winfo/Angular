package com.bank.bankapplication.view;

public class JointAccountView {
	@Override
	public String toString() {
		return "JointAccountView [id=" + id + ", account_number=" + account_number + ", type=" + type
				+ ", account_type=" + account_type + ", balance=" + balance + ", user1=" + user1 + ", user2=" + user2
				+ "]";
	}
	private int id ;
	private long account_number;
	private String type;
	private String account_type;
	private double balance;
	private int user1;
	private int user2;
	public int getUser1() {
		return user1;
	}
	public void setUser1(int user1) {
		this.user1 = user1;
	}
	public int getUser2() {
		return user2;
	}
	public void setUser2(int user2) {
		this.user2 = user2;
	}
	public JointAccountView() {
		// TODO Auto-generated constructor stub
	}
	public JointAccountView(int id, long account_number, String type, String account_type, double balance) {
		super();
		this.id = id;
		this.account_number = account_number;
		this.type = type;
		this.account_type = account_type;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
