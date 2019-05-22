package finalproject.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import finalproject.data.entities.Customer;
import finalproject.service.CustomerService;

@Controller
public class LoginController {
	
	Customer customer = new Customer();
	
	@Autowired
	private CustomerService customerService;
		
	
}
