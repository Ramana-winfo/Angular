package com.bank.bankapplication.service;

import java.util.List;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.view.FDAccoutView;
import com.bank.bankapplication.view.UserDetailsView;
import com.bank.bankapplication.view.UserView;

public interface UserService {

	public void createUser(UserView userView);

	public List<UserView> getUsers();

	public void deleteUser(int id);

	public List<Accounts> getAccounts(int id);

	public UserDetailsView getUser(int id);

    public User getUserById(int id);
	
//	public List<FDAccoutView> getUserFds(int id); 
	
	
	

}
