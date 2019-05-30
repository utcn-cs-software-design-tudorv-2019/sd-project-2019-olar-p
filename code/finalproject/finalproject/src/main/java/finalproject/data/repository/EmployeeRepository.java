package finalproject.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
