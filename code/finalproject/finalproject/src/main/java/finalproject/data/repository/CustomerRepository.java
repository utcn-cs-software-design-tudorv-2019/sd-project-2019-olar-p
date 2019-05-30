package finalproject.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	public List <Customer> findAll();
	
	public Customer findByName(String name);
	
	@SuppressWarnings("unchecked")
	public Customer save(Customer customer);
}
