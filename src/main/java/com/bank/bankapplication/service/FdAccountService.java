package com.bank.bankapplication.service;

import java.util.List;

import com.bank.bankapplication.view.FDAccoutView;

public interface FdAccountService {

	void createFd(FDAccoutView fdv);

	public List<FDAccoutView> getUserFds(int id);

	void deleteFd(int id);

}
