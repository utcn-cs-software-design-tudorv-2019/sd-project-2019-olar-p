package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.entities.Employee;
import com.example.demo.data.repositories.EmployeeRepository;

@Service()
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public Employee findById(int id) {
		return employeeRepository.findById(id);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
}
