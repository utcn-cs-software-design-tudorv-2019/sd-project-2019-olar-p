package finalproject.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer> {

	Rental findByCustomerName(String name);

	Rental findByModel(String model);

	List<Rental> findAll();

}
