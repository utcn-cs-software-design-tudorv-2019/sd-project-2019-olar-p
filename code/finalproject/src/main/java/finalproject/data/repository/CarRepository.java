package finalproject.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
