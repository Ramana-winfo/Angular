package com.bank.bankapplication.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dao.UserDetailsDao;
import com.bank.bankapplication.entity.Address;
import com.bank.bankapplication.entity.UserDetails;
import com.bank.bankapplication.view.UserDetailsView;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserDetailsDao userDetailsDao;
	@Override
	@Transactional
	public UserDetails registerUser(UserDetailsView userDetailsView) {
		// TODO Auto-generated method stub
		
		
		UserDetails userDetails = new UserDetails();
		userDetails.setId(0);
		userDetails.setFirst_name(userDetailsView.getFirst_name());
		userDetails.setLast_name(userDetailsView.getLast_name());
		userDetails.setDOB(userDetailsView.getDateOfBirth());
		userDetails.setEmail(userDetailsView.getEmail());
		userDetails.setPhone(userDetailsView.getPhone());
		
            System.out.println(userDetails+"userDetails");
		return userDetailsDao.registerUser(userDetails); 
		
		
	}
	@Override
	@Transactional
	public void updateUser(UserDetailsView userDetailsView) {
		// TODO Auto-generated method stub
		System.out.println("this is service"+userDetailsView);
		UserDetails userDetails = new UserDetails();
		userDetails.setId(userDetailsView.getId());
		userDetails.setFirst_name(userDetailsView.getFirst_name());
		userDetails.setLast_name(userDetailsView.getLast_name());
		userDetails.setDOB(userDetailsView.getDateOfBirth());
		userDetails.setEmail(userDetailsView.getEmail());
		userDetails.setPhone(userDetailsView.getPhone());
		System.out.println("this is userDetails object: "+userDetails);
		userDetailsDao.updateUserDetails(userDetails);
	}	
	
}
