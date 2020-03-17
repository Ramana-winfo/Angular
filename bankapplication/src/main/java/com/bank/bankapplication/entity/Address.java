package com.bank.bankapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "type")
	private String type;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "house_number")
	private String houseNumber;
	
	@Column(name = "street_number")
	private String streetNumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "pincode")
	private String pincode;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", type=" + type + ", fullName=" + fullName + ", houseNumber=" + houseNumber
				+ ", streetNumber=" + streetNumber + ", city=" + city + ", district=" + district + ", pincode="
				+ pincode + "]";
	}
	
	
}
