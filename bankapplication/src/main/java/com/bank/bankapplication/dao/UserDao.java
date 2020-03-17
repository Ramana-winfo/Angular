package com.bank.bankapplication.dao;

import java.util.List;

import com.bank.bankapplication.entity.User;

public interface UserDao {

	public void createUser(User user);

	public List<User> getUsers();

}
