package com.bank.bankapplication.service;

import com.bank.bankapplication.entity.UserDetails;
import com.bank.bankapplication.view.UserDetailsView;

public interface UserDetailsService {
	public UserDetails registerUser(UserDetailsView userDetailsView);

	public void updateUser(UserDetailsView userDetailsView);

}
