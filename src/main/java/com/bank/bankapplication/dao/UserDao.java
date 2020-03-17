package com.bank.bankapplication.dao;

import java.util.List;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.entity.UserDetails;
import com.bank.bankapplication.view.UserView;

public interface UserDao {

	public void createUser(User user);

	public List<User> getUsers();

	public void deleteUser(int id);

	public List<Accounts> getAccounts(int id);

	public UserDetails getUser(int id);

	public User getUserById(int id);
	
	
	

}
