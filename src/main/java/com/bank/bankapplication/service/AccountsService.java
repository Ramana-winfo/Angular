package com.bank.bankapplication.service;

import java.util.List;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.view.JointAccountView;
import com.bank.bankapplication.view.SingleAccountView;

public interface AccountsService {

	public void createSingleAccount(SingleAccountView singleAccountView);

	public List<Accounts> getSingleAccounts();

	public void createJointAccount(JointAccountView jointAccountView);

	public void deleteAccount(int id);

}
