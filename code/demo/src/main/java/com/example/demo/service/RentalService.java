package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.entities.Rental;
import com.example.demo.data.repositories.RentalRepository;


@Service
public class RentalService {

	@Autowired
	private RentalRepository rentalRepository;
	
	public Rental findByCustomerName(int id) {
		return this.rentalRepository.findCustomerById(id);
	}
	public Rental findByCarId(int id){
		return this.rentalRepository.findCarById(id);
	}
	public List<Rental> findAll(){
		return this.rentalRepository.findAll();
	}
	
	public Rental save(Rental rental) {
		return this.save(rental);
	}

	
}
