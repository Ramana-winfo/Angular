package com.bank.bankapplication.entity;

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
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "full_name")
	private String fullName;
	@Column(name = "type")
	private String typeOfAddress;
	@Column(name = "house_number")
	private String houseNumber;
	@Column(name = "street_number")
	private String streetNuber;
	@Column(name = "city")
	private String city;
	@Column(name = "district")
	private String district;
	@Column(name = "pincode")
	private long pincode;
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH},fetch = FetchType.LAZY)
	@JoinColumn(name ="user_detail_id")
	private UserDetails userDetails;

//	public UserDetails getUserDetails() {
//		return userDetails;
//	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String fullName, String typeOfAddress, String houseNumber, String streetNuber, String city,
			String district, long pincode) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.typeOfAddress = typeOfAddress;
		this.houseNumber = houseNumber;
		this.streetNuber = streetNuber;
		this.city = city;
		this.district = district;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getTypeOfAddress() {
		return typeOfAddress;
	}
	public void setTypeOfAddress(String typeOfAddress) {
		this.typeOfAddress = typeOfAddress;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetNuber() {
		return streetNuber;
	}
	public void setStreetNuber(String streetNuber) {
		this.streetNuber = streetNuber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
}
