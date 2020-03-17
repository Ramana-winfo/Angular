package com.bank.bankapplication.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankapplication.service.AccountsService;
import com.bank.bankapplication.service.TransferFundsService;
import com.bank.bankapplication.view.TransferFundsView;

@RestController
@RequestMapping("/bank")
public class TransferFundsController {
	@Autowired
	private TransferFundsService transferFundsService;
	
	@PostMapping("/transaction")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public TransferFundsView createTransaction(@RequestBody TransferFundsView trancationView) {
		transferFundsService.createTransaction(trancationView);
		return trancationView;
	}
	@PostMapping("/transactionFdToAccount")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public TransferFundsView createTransactionFdToAccount(@RequestBody TransferFundsView trancationView) {
		transferFundsService.createTransactionFdToAccount(trancationView);
		return trancationView;
	}
	
	@PostMapping("/transactionAccountToFd")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public TransferFundsView createTransactionAccountToFd(@RequestBody TransferFundsView trancationView) {
		transferFundsService.createTransactionAccountToFd(trancationView);
		return trancationView;
	}
}
