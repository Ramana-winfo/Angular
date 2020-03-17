package com.bank.bankapplication.dao;

import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.entity.UserDetails;

public interface UserDetailsDao {
	public UserDetails registerUser(UserDetails userDetails);

	public void updateUserDetails(UserDetails userDetails);
}
