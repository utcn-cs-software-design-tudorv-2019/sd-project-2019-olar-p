package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.entities.Car;
import com.example.demo.service.CarService;


@Controller()
public class CarController {
	ModelAndView mv = new ModelAndView();
		
	@Autowired
    private CarService carService;
	
	public CarController(CarService carService) {
		this.carService = carService;
	}

	   @GetMapping(value = "cardetail")
	    public ModelAndView carDetail() {
		   
	        List<Car> cars = carService.findAll();
	        mv.addObject("cars", cars);
	        return mv;
	    }
	    
}