package finalproject.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import finalproject.data.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	public List<Car> findAll();
	
	public Car findByName(String name);
	
	@SuppressWarnings("unchecked")
	public Car save(Car car);
}
