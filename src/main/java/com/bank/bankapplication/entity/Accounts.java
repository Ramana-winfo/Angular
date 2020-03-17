package com.bank.bankapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "account_number")
	private long account_number;
	@Column(name = "type")
	private String type;
	@Column(name = "account_type")
	private String account_type;
	@Column(name = "balance")
	private double balance;
	
	@OneToOne(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User user;

//	@OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.LAZY)
//	private List<User> users;
	

	public Accounts() {
		// TODO Auto-generated constructor stub
	}
	
	public Accounts(long account_number, String type, String account_type, double balance) {
		super();
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
	public void setBalance(double d) {
		this.balance = d;
	}
	
}
