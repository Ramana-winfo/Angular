package com.bank.bankapplication.service;

import java.util.List;

import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.view.UserView;

public interface UserService {

	public void createUser(UserView userView);

	public List<User> getUsers();

}
