package com.example.demo.data.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.entities.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

	public List<Car> findAll();
	
	public Car findByName(String name);
	
	public Car findById(int carId);
	
}
