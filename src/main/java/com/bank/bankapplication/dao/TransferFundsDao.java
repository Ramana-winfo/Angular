package com.bank.bankapplication.dao;

public interface TransferFundsDao{

	void createTransaction(long fromAccount, long toAccount, double ammount);

	void createTransactionFdToAccount(long fdAccount, long accountNumber, double amount);

	void createTransactionAccountToFd(long accountNumber, long fdAccount, double amount);

}
