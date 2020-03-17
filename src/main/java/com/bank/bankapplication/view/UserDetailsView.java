package com.bank.bankapplication.view;

import java.sql.Date;

public class UserDetailsView 
{
	
	private int id;
	private String first_name;
	private String last_name;
	private Date dateOfBirth;
	private String email;
	private long phone;
	
	
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
//	public Date getDOB() {
//		return dob;
//	}
//	public void setDOB(Date DOB) {
//		this.dob = DOB;
//	}
//	@Override
//	public String toString() {
//		return "UserDetailsView [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", DOB=" + dob
//				+ ", email=" + email + ", phone=" + phone + "]";
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserDetailsView [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phone=" + phone + "]";
	}
}
