package com.bank.bankapplication.dao;

import java.util.List;

import com.bank.bankapplication.entity.Address;
import com.bank.bankapplication.view.AddressView;

public interface AddressDao {

	public void mailingAddressCreate(Address mailAddress, int id);

	public void permanentAddressCreate(Address perAddress, int id);

	public List<AddressView> getAddresses(int u_d_id);

	public void deleteAddress(int id);

	
	
}
