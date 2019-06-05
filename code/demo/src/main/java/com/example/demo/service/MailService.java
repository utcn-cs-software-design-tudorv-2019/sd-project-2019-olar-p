package com.example.demo.service;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.example.demo.data.entities.Car;
import com.example.demo.data.entities.Customer;
import com.example.demo.data.entities.Rental;
import com.example.demo.data.repositories.MailRepository;
import com.google.common.collect.Lists;

import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.service.EmailService;

public class MailService implements MailRepository {
   
	private EmailService emailService;
    private CustomerService customerService;

    public MailService(EmailService emailService, CustomerService customerService) {
        this.emailService = emailService;
        this.customerService = customerService;
    }

    @Override
    public void sendMail(Customer customer, Rental rental, Car car) {
        try {
            final Email email = DefaultEmail.builder().from(new InternetAddress("springcarrental@interia.pl"))
                    .to(Lists.newArrayList(new InternetAddress(customer.getUsername())))
                    .subject("Resume of your orders in Car Rental")
                    .body("Dear, " + customer.getName() + "\n\nThank You for borrowing our car."
                            + "\nHere is resume of your order." + "\nChosen car: " + car.getCarName() + ", "
                            + car.getPrice() + " EUR/day" + "\nBorrowed date range: " + rental.getStartDate()
                            + " - " + rental.getEndDate())
                    .encoding("UTF-8").build();
            emailService.send(email);
        } catch (AddressException e) {
            System.out.println(e.getMessage());
        }

    }

    public void sendMailTest() {
        try {
            final Email email = DefaultEmail.builder().from(new InternetAddress("springcarrental@interia.pl"))
                    .to(Lists.newArrayList(new InternetAddress("twistezo@outlook.com")))
                    .subject("Resume of your orders in Car Rental").body("Dear, ").encoding("UTF-8").build();
            emailService.send(email);
        } catch (AddressException e) {
            System.out.println(e.getMessage());
        }

    }
}