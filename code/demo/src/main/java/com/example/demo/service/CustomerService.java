package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.entities.Customer;
import com.example.demo.data.repositories.CustomerRepository;

@Service
public class CustomerService {

	public static Customer auxCustomer;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer findByName(String name) {
		return this.customerRepository.findByName(name);
	}
	
	public List<Customer> findAll(){
		return this.customerRepository.findAll();
	}
	
	public Customer save(Customer customer) {
		return this.save(customer);
	}
	
	
	public boolean validate(Customer customer) {
		
		if(customerRepository.findByName(customer.getName()) == null) {
			return false;
		}
		 auxCustomer = customerRepository.findByName(customer.getName());
	
		if(auxCustomer.getPassword().equals(customer.getPassword())) {
		System.out.printf("Success");
		return true;
		}
		else return false;
	}
}