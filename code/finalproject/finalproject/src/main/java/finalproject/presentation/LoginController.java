package finalproject.presentation;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import finalproject.data.entities.Customer;
import finalproject.service.CustomerService;

@Controller
public class LoginController {
	
	Customer customer = new Customer();
	
	@Inject
	private CustomerService customerService;
		
	@GetMapping("CustomerPage")
	public String getClientStudent(@RequestParam("username") String username,@RequestParam("password") String password)
	{
			
		customer.setUsername(username);
		customer.setPassword(password);
		
		if(customerService.validate(customer)) return "CustomerPage";
		else return "Login";
	
	}
}
