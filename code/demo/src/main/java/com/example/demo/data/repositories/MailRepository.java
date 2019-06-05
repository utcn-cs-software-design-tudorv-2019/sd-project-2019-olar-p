package com.example.demo.data.repositories;



import com.example.demo.data.entities.Car;
import com.example.demo.data.entities.Customer;
import com.example.demo.data.entities.Rental;


public interface MailRepository {
	
	   void sendMailTest();

	  void sendMail(Customer customer,Rental rental, Car car);

}
