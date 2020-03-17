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

import com.bank.bankapplication.service.AddressService;
import com.bank.bankapplication.view.AddressView;
import com.bank.bankapplication.view.MailingAddressView;
import com.bank.bankapplication.view.PermanentAddressView;

@RestController
@RequestMapping("/bank")
public class AddressRestController {
		@Autowired
		private AddressService addressService;
		@PostMapping("/mailaddress")
		@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
		public String  mailingAddressCreate(@RequestBody MailingAddressView mailingAddressView) {
			addressService.mailingAddressCreate(mailingAddressView);
			System.out.println("this is obj" +mailingAddressView);
			return "mail address created"+mailingAddressView.toString();
		}
		@PostMapping("/permamentaddress")
		@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
		public String permanentAddressCreate(@RequestBody PermanentAddressView permanentAddressView) {
			addressService.permanentAddressCreate(permanentAddressView);
			return "temparory address creted"+permanentAddressView;
			
		}
		
		@GetMapping("/getAddresses/{id}")
		@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
		public List<AddressView> getAddresses(@PathVariable int id){
			return addressService.getAddresses(id);
		}
		
		@DeleteMapping("/address/{id}")
		public String deleteAddress(@PathVariable int id) {
			addressService.deleteAddress(id);
			return "address deleted";
		}
}


