package com.bank.bankapplication.service;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dao.AccountsDao;
import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.view.JointAccountView;
import com.bank.bankapplication.view.SingleAccountView;
@Service
public class AccountsServiceImpl implements AccountsService {
	@Autowired
	private AccountsDao accountsDao;
	@Override
	@Transactional
	public void createSingleAccount(SingleAccountView singleAccountView) {
//		 TODO Auto-generated method stub
		int user_id =singleAccountView.getUser_id();
		Accounts accounts=new Accounts();
		accounts.setId(0);
		accounts.setAccount_number(singleAccountView.getAccount_number());
		accounts.setAccount_type(singleAccountView.getAccount_type());
		accounts.setType(singleAccountView.getType());
		accounts.setBalance(singleAccountView.getBalance());
		accountsDao.createSingleAccount(accounts,user_id);
	}
	@Override
	@Transactional
	public List<Accounts> getSingleAccounts() {
		// TODO Auto-generated method stub
		List<Accounts> accounts=accountsDao.getSingleAccounts();
		

		return accounts; 
	}
	@Override
	@Transactional
	public void createJointAccount(JointAccountView jointAccountView) {
		// TODO Auto-generated method stub
		int user1 =jointAccountView.getUser1();
		int user2 =jointAccountView.getUser2();
		Accounts jointAccounts = new Accounts();
		jointAccounts.setId(0);
		jointAccounts.setAccount_number(jointAccountView.getAccount_number());
		jointAccounts.setAccount_type(jointAccountView.getAccount_type());
		jointAccounts.setType(jointAccountView.getType());
		jointAccounts.setBalance(jointAccountView.getBalance());
		accountsDao.createJointAccount(jointAccounts, user1,user2);
		
		
	}

}
