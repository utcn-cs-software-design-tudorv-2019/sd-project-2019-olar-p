package finalproject.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import finalproject.data.entities.Customer;
import finalproject.data.repository.CustomerRepository;

@Service
public class CustomerService {

	@Inject
	CustomerRepository customerRepository;
	
	public Customer findByName(String name) {
		return this.customerRepository.findByName(name);
	}
	
	public List<Customer> findAll(){
		return this.customerRepository.findAll();
	}
	
	public Customer save(Customer customer) {
		return this.save(customer);
	}
}
