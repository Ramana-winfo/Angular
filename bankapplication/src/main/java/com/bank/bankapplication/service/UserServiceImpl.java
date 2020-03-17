package com.bank.bankapplication.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dao.UserDao;
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.view.UserView;
@Service
public  class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		
		return userDao.getUsers();
	}

	@Override
	@Transactional
	public void createUser(UserView userView) {
		// TODO Auto-generated method stub
		User user = new User(userView.getName());
		user.setId(0);
		userDao.createUser(user);
	}

}
