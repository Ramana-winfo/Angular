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
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="primary_account_id")
	private Accounts account;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="user_detail_id")
	private UserDetails userDetails;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name ="user_id")
	private List<FDAccount> fdaccount = new ArrayList<>();
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH},fetch = FetchType.LAZY)
	@JoinColumn(name ="joint_account_id")
	private Accounts jointAccount;
	
	public List<FDAccount> getFdaccount() {
		return fdaccount;
	}
	public void setFdaccount(List<FDAccount> fdaccount) {
		this.fdaccount = fdaccount;
	}
	
	public Accounts getJointAccount() {
		return jointAccount;
	}
	public void setJointAccount(Accounts jointAccount) {
		this.jointAccount = jointAccount;
	}
	
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public Accounts getAccount() {
		return account;
	}
	public void setAccount(Accounts accounts) {
		this.account = accounts;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", userDetails=" + userDetails
				+ ", fdaccount=" + fdaccount + ", jointAccount=" + jointAccount + "]";
	}
	
}
