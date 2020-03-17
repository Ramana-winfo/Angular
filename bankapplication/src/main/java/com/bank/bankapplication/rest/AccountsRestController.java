package com.bank.bankapplication.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.service.AccountsService;
import com.bank.bankapplication.view.JointAccountView;
import com.bank.bankapplication.view.SingleAccountView;

@RestController
@RequestMapping("/bank")
public class AccountsRestController {
	@Autowired
	private AccountsService accountsService;
	@GetMapping("/singleaccount")
	public List<Accounts> getSingleAccounts() {
		
		return accountsService.getSingleAccounts();
	}
	@PostMapping("/singleaccount")
	public String createSingleAccount(@RequestBody SingleAccountView singleAccountView) {
		accountsService.createSingleAccount(singleAccountView);
		return "single account created";
	}
	
	@PostMapping("/jointaccount")
	public String createJointAccount(@RequestBody JointAccountView jointAccountView ) {
		accountsService.createJointAccount(jointAccountView);
		return "joint account created";
	}
}
