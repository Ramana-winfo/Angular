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

import com.bank.bankapplication.service.FdAccountService;
import com.bank.bankapplication.view.FDAccoutView;

@RestController
@RequestMapping("/bank")
public class FdAccountController {
	@Autowired
	FdAccountService service;
	@PostMapping("/fd")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public FDAccoutView createFd(@RequestBody FDAccoutView fdv) {
		
		service.createFd(fdv);
		
		return fdv;
	}
	@GetMapping("/users/fd/{id}")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public List<FDAccoutView> getUserFds(@PathVariable int id){
		return service.getUserFds(id);
	}
	
	@DeleteMapping("/fd/{id}")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public String deleteFd(@PathVariable int id)
	{
		
		service.deleteFd(id);
		return "user was deleted";
	}
	

}
