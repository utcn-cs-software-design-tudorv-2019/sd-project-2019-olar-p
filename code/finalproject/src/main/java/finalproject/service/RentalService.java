package finalproject.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import finalproject.data.repository.RentalRepository;

@Service
public class RentalService {

	@Inject
	RentalRepository rentalRepository;
	
}
