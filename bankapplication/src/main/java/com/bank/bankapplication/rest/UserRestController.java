package com.bank.bankapplication.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.service.UserService;
import com.bank.bankapplication.view.UserView;

@RestController
@RequestMapping("/bank")
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@PostMapping("/users")
	public String createUser(@RequestBody UserView userView) {
		userService.createUser(userView);
		return "create User";
	}
}
