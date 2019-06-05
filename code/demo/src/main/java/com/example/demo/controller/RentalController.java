package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.entities.Car;
import com.example.demo.data.entities.Customer;
import com.example.demo.data.entities.Rental;
import com.example.demo.service.CarService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.MailService;
import com.example.demo.service.RentalService;

@Controller
public class RentalController {
	
	ModelAndView mv = new ModelAndView();
	
	@Autowired
	private RentalService rentalService;
	@Autowired
	private CarService carService;
	@Autowired
	private CustomerService customerService;

	private MailService mailService;
	
	private Car carbyid;
	
	   @RequestMapping(value = "bookrental", method = RequestMethod.GET)
	    public String showCustomerResume(Model model, Customer customer, Rental rental,
	            @RequestParam(value = "car_id") int carId) {
			carbyid = carService.findById(carId);
	        model.addAttribute("Rental", rental);
	        model.addAttribute("cust", customer);
	        model.addAttribute("carById", carbyid);
	        return "bookResume";
	    }

	    @RequestMapping(value = "bookrental", method = RequestMethod.POST)
	    public String completeAll(Customer customer, Rental rental, SessionStatus status) {
	        rentalService.save(rental);
	        customerService.save(customer);
	        mailService.sendMail(customer, rental, carbyid);
	        status.setComplete();
	        return "redirect:/";
	    }
	
}
