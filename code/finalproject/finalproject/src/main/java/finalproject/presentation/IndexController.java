package finalproject.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	
	@RequestMapping(value = "/")
    public String getIndex()
    {
        return "index";
    }
	
	/*@GetMapping("AdminPage")
    public String getAdmintPage()
    {
        return "AdminPage";
    }*/
	
	@GetMapping("Login")
    public String getLoginPage()
    {
        return "Login";
    }
	
	
}