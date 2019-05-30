package finalproject.service;

import java.util.List;

import javax.inject.Inject;


import org.springframework.stereotype.Service;

import finalproject.data.entities.Customer;
import finalproject.data.repository.CustomerRepository;

@Service
public class CustomerService {

	@Inject
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

		Customer auxCustomer = customerRepository.findByName(customer.getName());
	
		if(auxCustomer.getPassword().equals(customer.getPassword())) {
		System.out.printf("Success");
		return true;
		}
		else return false;
	}
}
