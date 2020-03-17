package com.bank.bankapplication.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.entity.Address;
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.entity.UserDetails;
import com.bank.bankapplication.view.AddressView;
@Repository
public class AddressDaoImpl implements AddressDao {
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void mailingAddressCreate(Address mailAddress,int id) {
		Session session = entityManager.unwrap(Session.class);
		UserDetails userDetails = session.get(UserDetails.class, id);
		System.out.println("user details gets"+userDetails);
		userDetails.addAddress(mailAddress);
		session.save(mailAddress);
		
	}

	@Override
	public void permanentAddressCreate(Address perAddress, int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		UserDetails userDetails = session.get(UserDetails.class, id);
		System.out.println("user details gets"+userDetails);
		userDetails.addAddress(perAddress);
		session.save(perAddress);

	}

	

	@Override
	public List<AddressView> getAddresses(int u_d_id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);

		UserDetails u=session.get(UserDetails.class, u_d_id);
		List<AddressView> addresses=new ArrayList<AddressView>();
		List<Address> add=u.getAddress();
		for(int i=0;i<add.size();i++) {
			Address address= add.get(i);
			AddressView add1= new AddressView();
			add1.setCity(address.getCity());
			add1.setDistrict(address.getDistrict());
			add1.setPincode(address.getPincode());
			add1.setHouseNumer(address.getHouseNumber());
			add1.setStreet(address.getStreetNuber());
			add1.setTypeOfAddress(address.getTypeOfAddress());
			addresses.add(add1);
			
		}
		
		return addresses;
	}

	@Override
	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Address address =session.get(Address.class, id);
		session.delete(address);

	}


}
