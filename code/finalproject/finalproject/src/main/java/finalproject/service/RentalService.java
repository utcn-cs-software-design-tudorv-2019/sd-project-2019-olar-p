package finalproject.service;



import java.util.List;

import javax.inject.Inject;


import org.springframework.stereotype.Service;

import finalproject.data.entities.Rental;
import finalproject.data.repository.RentalRepository;

@Service
public class RentalService {

	@Inject
	private RentalRepository rentalRepository;
	/*
	public Rental findByCustomerName(String name) {
		return this.rentalRepository.findByCustomerName(name);
	}
	public Rental findByModel(String model){
		return this.rentalRepository.findByModel(model);
	}*/
	public List<Rental> findAll(){
		return this.rentalRepository.findAll();
	}
	
}
