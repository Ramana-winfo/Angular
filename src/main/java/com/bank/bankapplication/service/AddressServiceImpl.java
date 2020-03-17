package com.bank.bankapplication.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dao.AddressDao;
import com.bank.bankapplication.entity.Address;
import com.bank.bankapplication.view.AddressView;
import com.bank.bankapplication.view.MailingAddressView;
import com.bank.bankapplication.view.PermanentAddressView;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDao addressDao;
	@Override
	@Transactional
	public void mailingAddressCreate(MailingAddressView mailingAddressView) {
		Address mailAddress=new Address();
		int userdetailid=mailingAddressView.getUser_detail_id();
		System.out.println("user detai id"+mailingAddressView.getUser_detail_id());
		mailAddress.setId(0);
		mailAddress.setCity(mailingAddressView.getCity());
		mailAddress.setDistrict(mailingAddressView.getDistrict());
		mailAddress.setFullName(mailingAddressView.getFullName());
		mailAddress.setPincode(mailingAddressView.getPincode());
		mailAddress.setHouseNumber(mailingAddressView.getHouseNumber());
		mailAddress.setStreetNuber(mailingAddressView.getStreetNuber());
		mailAddress.setTypeOfAddress(mailingAddressView.getTypeOfAddress());
		addressDao.mailingAddressCreate(mailAddress,userdetailid);
	}

	@Override
	@Transactional
	public void permanentAddressCreate(PermanentAddressView permanentAddressView) {
		// TODO Auto-generated method stub
		Address perAddress = new Address();
		int id=permanentAddressView.getUser_detail_id();
		perAddress.setId(0);
		perAddress.setCity(permanentAddressView.getCity());
		perAddress.setDistrict(permanentAddressView.getDistrict());
		perAddress.setFullName(permanentAddressView.getFullName());
		perAddress.setPincode(permanentAddressView.getPincode());
		perAddress.setHouseNumber(permanentAddressView.getHouseNumber());
		perAddress.setStreetNuber(permanentAddressView.getStreetNuber());
		perAddress.setTypeOfAddress(permanentAddressView.getTypeOfAddress());
		addressDao.permanentAddressCreate(perAddress,id);
		
	}

	@Override
	@Transactional
	public List<AddressView> getAddresses(int u_d_id) {
		// TODO Auto-generated method stub

		List<AddressView> addresses =addressDao.getAddresses(u_d_id);
		return addresses;
	}

	@Override
	@Transactional
	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		addressDao.deleteAddress(id);
	}

}
