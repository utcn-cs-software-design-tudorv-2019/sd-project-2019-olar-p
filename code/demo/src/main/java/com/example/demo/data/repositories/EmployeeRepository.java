package com.example.demo.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findById(int id);
	
	public List<Employee> findAll();
}
