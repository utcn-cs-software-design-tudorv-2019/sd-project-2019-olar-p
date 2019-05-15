package finalproject.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
