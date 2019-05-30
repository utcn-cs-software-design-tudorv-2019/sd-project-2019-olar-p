package finalproject.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
	
	/*public Rental findByCustomerName(String name);

	public Rental findByModel(String model);
	*/
	public List<Rental> findAll();

}
