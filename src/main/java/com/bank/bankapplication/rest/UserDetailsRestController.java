package com.bank.bankapplication.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankapplication.entity.UserDetails;
import com.bank.bankapplication.service.UserDetailsService;
import com.bank.bankapplication.view.UserDetailsView;
@RestController
@RequestMapping("/bank")
public class UserDetailsRestController {
	@Autowired
	private UserDetailsService userDetailsService;
	
	@PostMapping("/userregister")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public UserDetails userRegister(@RequestBody UserDetailsView userDetailsView) {
		System.out.println(userDetailsView);
	return 	userDetailsService.registerUser(userDetailsView);
		
	}
	
	@PutMapping("/usersDetail")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public String updateUserDetail(@RequestBody UserDetailsView userDetailsView)
	{
		userDetailsService.updateUser(userDetailsView);
		return "updated User";
	}
}
