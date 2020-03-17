package com.bank.bankapplication.view;

public class PermanentAddressView {
	private String fullName;
	private String typeOfAddress;
	private String houseNumber;
	private String streetNuber;
	private String city;
	private String district;
	private long pincode;
	private int user_detail_id;
	
	@Override
	public String toString() {
		return "PermanentAddressView [fullName=" + fullName + ", typeOfAddress=" + typeOfAddress + ", houseNumber="
				+ houseNumber + ", streetNuber=" + streetNuber + ", city=" + city + ", district=" + district
				+ ", pincode=" + pincode + ", user_detail_id=" + user_detail_id + "]";
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

	public int getUser_detail_id() {
		return user_detail_id;
	}

	public void setUser_detail_id(int user_detail_id) {
		this.user_detail_id = user_detail_id;
	}

	public PermanentAddressView(String fullName, String typeOfAddress, String houseNumber, String streetNuber,
			String city, String district, long pincode, int user_detail_id) {
		super();
		this.fullName = fullName;
		this.typeOfAddress = typeOfAddress;
		this.houseNumber = houseNumber;
		this.streetNuber = streetNuber;
		this.city = city;
		this.district = district;
		this.pincode = pincode;
		this.user_detail_id = user_detail_id;
	}

}
