package com.bank.bankapplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private UserDetails userdetails;
	
	public UserDetails getUserdetails() {
		return userdetails;
	}
	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="primary_account_id")
	private Accounts accounts;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<FDAccount> fdaccount = new ArrayList<>();

	public List<FDAccount> getFdaccount() {
		return fdaccount;
	}
	public void setFdaccount(List<FDAccount> fdaccount) {
		this.fdaccount = fdaccount;
	}
	public Accounts getAccounts() {
		return accounts;
	}
	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
