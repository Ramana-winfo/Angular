package com.bank.bankapplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dao.UserDao;
import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.entity.UserDetails;
import com.bank.bankapplication.view.UserDetailsView;
import com.bank.bankapplication.view.UserView;
@Service
public  class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public List<UserView> getUsers() {
		// TODO Auto-generated method stub
		List<UserView> userviews = new ArrayList<UserView>();
		List<User> users =userDao.getUsers();
		for(int i=0;i<users.size();i++) {
			UserView u = new UserView();
			User user = users.get(i);
			u.setId(user.getId());
			u.setName(user.getName());
			userviews.add(u);
			
		}
		return userviews;
	}

	@Override
	@Transactional
	public void createUser(UserView userView) {
		// TODO Auto-generated method stub
		User user = new User(userView.getName());
		user.setId(0);
		userDao.createUser(user);
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	@Override
	@Transactional
	public List<Accounts> getAccounts(int id) {
		// TODO Auto-generated method stub
		List<Accounts> list =userDao.getAccounts(id);
		return list;
	}

	@Override
	public UserDetailsView getUser(int id) {
		// TODO Auto-generated method stub
		UserDetails user= userDao.getUser(id);
		UserDetailsView uv=new UserDetailsView();
				uv.setId(user.getId());
				uv.setEmail(user.getEmail());
				uv.setDateOfBirth(user.getDOB());
				uv.setFirst_name(user.getFirst_name());
				uv.setLast_name(user.getLast_name());
				uv.setPhone(user.getPhone());

		return uv;
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		
		return userDao.getUserById(id);
	}
	
	

}
