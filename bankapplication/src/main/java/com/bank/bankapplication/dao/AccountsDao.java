package com.bank.bankapplication.dao;

import java.util.List;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.view.SingleAccountView;

public interface AccountsDao {

	public void createSingleAccount(Accounts singleAccount, int user_id);

	public List<Accounts> getSingleAccounts();

	public void createJointAccount(Accounts jointAccounts, int user1, int user2);

}
