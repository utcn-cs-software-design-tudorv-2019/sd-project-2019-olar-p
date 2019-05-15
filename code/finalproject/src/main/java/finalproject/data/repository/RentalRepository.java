package finalproject.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import finalproject.data.entities.Rental;

public interface RentalRepository extends JpaRepository<Rental, Integer>{

}
