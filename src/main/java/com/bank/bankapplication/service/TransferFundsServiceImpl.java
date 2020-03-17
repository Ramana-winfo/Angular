package com.bank.bankapplication.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dao.AccountsDao;
import com.bank.bankapplication.dao.TransferFundsDao;
import com.bank.bankapplication.view.TransferFundsView;
@Service
public class TransferFundsServiceImpl implements TransferFundsService {
	
	
	@Autowired
	private TransferFundsDao transferFundsDao;
	
	@Override
	@Transactional
	public void createTransaction(TransferFundsView trancationView) {
	long fromAccount=trancationView.getFromAccount();
	long toAccount=trancationView.getToAccount();
	double Ammount=trancationView.getAmmount();
	System.out.println(fromAccount);
	transferFundsDao.createTransaction(fromAccount,toAccount,Ammount);


	}

	@Override
	@Transactional
	public void createTransactionFdToAccount(TransferFundsView trancationView) {
		long fdAccount=trancationView.getFdAccount();
		long accountNumber=trancationView.getAccountNumber();
		double amount=trancationView.getAmmount();
		transferFundsDao.createTransactionFdToAccount(fdAccount,accountNumber,amount);
		
	}

	@Override
	@Transactional
	public void createTransactionAccountToFd(TransferFundsView trancationView) {
		long accountNumber=trancationView.getAccountNumber();
		long fdAccount=trancationView.getFdAccount();
		double amount=trancationView.getAmmount();
		transferFundsDao.createTransactionAccountToFd(accountNumber,fdAccount,amount);
	}
}
