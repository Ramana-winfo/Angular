package com.bank.bankapplication.service;

import com.bank.bankapplication.view.TransferFundsView;

public interface TransferFundsService {
	public void createTransaction(TransferFundsView trancationView);

	public void createTransactionFdToAccount(TransferFundsView trancationView);

	public void createTransactionAccountToFd(TransferFundsView trancationView);
}
