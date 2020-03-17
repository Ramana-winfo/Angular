package com.bank.bankapplication.entity;

import java.sql.Date;
import java.util.ArrayList;
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
@Table(name = "user_detail")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="DOB")
	private Date DOB;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private long phone;
	
    @OneToOne(mappedBy = "userDetails",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User user;
    
    
    @OneToMany(mappedBy="userDetails",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Address> address;
	public void addAddress(Address a) {
		if(a==null) {
		address= new ArrayList<Address>();
		}
		else {
			address.add(a);
			a.setUserDetails(this);
		}
	}

	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() { 
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
}
