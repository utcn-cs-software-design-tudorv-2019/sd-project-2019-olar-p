package finalproject.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import finalproject.data.entities.Car;
import finalproject.data.repository.CarRepository;

@Service()
public class CarService {

	@Inject
	CarRepository carRepository;
	
	public List<Car> findAll(){
		return this.findAll();
	}
	
	public Car findByName(String name) {
		return this.findByName(name);
	}
	
	public Car save(Car car) {
		return this.carRepository.save(car);
	}
}
