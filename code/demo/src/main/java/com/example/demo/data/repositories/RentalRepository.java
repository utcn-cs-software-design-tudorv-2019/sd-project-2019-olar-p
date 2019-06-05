package com.example.demo.data.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.entities.Customer;
import com.example.demo.data.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
	
	public Rental findCustomerById(int customerId);

	public Rental findCarById(int carId);
	
	@SuppressWarnings("unchecked")
	public Rental save(Rental rental);
	
	public List<Rental> findAll();

}
