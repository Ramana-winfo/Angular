package com.bank.bankapplication.service;

import java.util.List;

import com.bank.bankapplication.view.AddressView;
import com.bank.bankapplication.view.MailingAddressView;
import com.bank.bankapplication.view.PermanentAddressView;

public interface AddressService {

	public void mailingAddressCreate(MailingAddressView mailingAddressView);
	
	public void permanentAddressCreate(PermanentAddressView permanentAddressView);

	public List<AddressView> getAddresses(int u_d_id);

	public void deleteAddress(int id);

}
