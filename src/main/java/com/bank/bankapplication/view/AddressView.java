package com.bank.bankapplication.view;

public class AddressView {
	private String typeOfAddress;
	private String houseNumer;
	private String street;
	private String city;
	private String district;
	private long pincode;
	public String getTypeOfAddress() {
		return typeOfAddress;
	}
	public void setTypeOfAddress(String typeOfAddress) {
		this.typeOfAddress = typeOfAddress;
	}
	public String getHouseNumer() {
		return houseNumer;
	}
	public void setHouseNumer(String houseNumer) {
		this.houseNumer = houseNumer;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
