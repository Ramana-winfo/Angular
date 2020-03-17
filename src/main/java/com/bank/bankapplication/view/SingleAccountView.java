package com.bank.bankapplication.view;

public class SingleAccountView {
	private long account_number;
	private String type;
	private String account_type;
	private long balance;
	private int user_id;
	public SingleAccountView( long account_number, String type, String account_type, long balance,int user_id) {
		super();
		this.account_number = account_number;
		this.type = type;
		this.account_type = account_type;
		this.balance = balance;
		this.user_id=user_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public SingleAccountView() {
		// TODO Auto-generated constructor stub
	}
	public long getAccount_number() {
		return account_number;
	}
	@Override
	public String toString() {
		return "SingleAccountView [account_number=" + account_number + ", type=" + type + ", account_type="
				+ account_type + ", balance=" + balance + "]";
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
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
