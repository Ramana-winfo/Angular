package com.bank.bankapplication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fd_account")
public class FDAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "account_number")
	private long accountNumber;
	
	@Column(name = "ammount")
	private double amount;
	
	@Column(name = "time_period")
	private double timePeriod;

//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	private User user;
	
	
	
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(double timePeriod) {
		this.timePeriod = timePeriod;
	}
	
	
	@Override
	public String toString() {
		return "FDAccount [id=" + id + ", accountNumber=" + accountNumber + ", amount=" + amount + ", timePeriod="
				+ timePeriod +  "]";
	}
	
}
