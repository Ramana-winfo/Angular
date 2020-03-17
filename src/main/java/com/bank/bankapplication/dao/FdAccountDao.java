package com.bank.bankapplication.dao;

import java.util.List;

import com.bank.bankapplication.entity.FDAccount;

public interface FdAccountDao {

	void createFd(FDAccount fd, int userId);

	List<FDAccount> getUserFds(int id);

	void deleteFd(int id);

}
