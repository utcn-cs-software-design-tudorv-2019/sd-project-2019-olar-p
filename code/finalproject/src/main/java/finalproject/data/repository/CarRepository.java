package finalproject.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

	List<Car> findAll();
	
	Car findByName(String name);
	
	@SuppressWarnings("unchecked")
	public Car save(Car car);
}
