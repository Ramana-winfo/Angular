package com.bank.bankapplication.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public List<Accounts> getSingleAccounts() {
		
		return accountsService.getSingleAccounts();
	}
	@PostMapping("/singleaccount")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public String createSingleAccount(@RequestBody SingleAccountView singleAccountView) {
		accountsService.createSingleAccount(singleAccountView);
		return "single account created";
	}
	
	@PostMapping("/jointaccount")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public String createJointAccount(@RequestBody JointAccountView jointAccountView ) {
		accountsService.createJointAccount(jointAccountView);
		return "joint account created"+jointAccountView.toString();
	}
	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public String deleteAccount(@PathVariable int id)
	{
		accountsService.deleteAccount(id);
		return "Account deleted";
	}
	
}
