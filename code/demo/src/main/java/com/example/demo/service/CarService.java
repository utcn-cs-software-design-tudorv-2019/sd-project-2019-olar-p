package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.entities.Car;
import com.example.demo.data.repositories.CarRepository;

@Service()
public class CarService{

	@Autowired
	private CarRepository carRepository;
	
	public List<Car> findAll(){
		return carRepository.findAll();
	}
	
	public Car findByName(String name) {
		return carRepository.findByName(name);
	}
	
	public Car findById(int carId) {
		return carRepository.findById(carId);
	}
}