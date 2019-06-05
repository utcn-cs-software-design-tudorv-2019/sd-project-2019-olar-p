package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.data.entities.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class LoginController {

	public static Customer customer = new Customer();
	
	private static int loginFlag=0;
	
	@Autowired
	private CustomerService customerService;
		
	@GetMapping("login3")
	public String getCustomer(@RequestParam(required= false, name = "username") String username,@RequestParam(required=false, name= "password") String password)
	{

		customer.setUsername(username);
		customer.setPassword(password);
		
		if(customerService.validate(customer)) {
			loginFlag = 1;
			return "login";
		}
		else return "layout";
	
	}
	public static Customer getLoggedCustomer() {
		if(loginFlag==1) {
			return customer;
		}
		else return new Customer();
	}
}
