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
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.service.UserService;
import com.bank.bankapplication.view.UserDetailsView;
import com.bank.bankapplication.view.UserView;

@RestController
@RequestMapping("/bank")
public class UserRestController {
	@Autowired
	private UserService userService;
	//geting users
	
	@GetMapping("/users")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public List<UserView> getUsers(){
		return userService.getUsers();
	}
	//register user
	@PostMapping("/users")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public String createUser(@RequestBody UserView userView) {
		userService.createUser(userView);
		return "create User";
	}
	
	
	@DeleteMapping("/users/{id}")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public String deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
		return "user deleted";
	}
	
	@GetMapping("/users/{id}")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public User getUserById(@PathVariable int id)
	{
		return userService.getUserById(id);
	}
	
	@GetMapping("/users/accounts/{id}")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public List<Accounts> getUsersById(@PathVariable int id)
	{
		List<Accounts> list= userService.getAccounts(id);
		return list;
	}
	@GetMapping("userdetails/{id}")
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	public UserDetailsView getUserDetailsById(@PathVariable int id) {
		return userService.getUser(id);
	}
	
}
