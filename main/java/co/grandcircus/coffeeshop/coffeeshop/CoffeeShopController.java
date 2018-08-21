package co.grandcircus.coffeeshop.coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
	ModelAndView mav = new ModelAndView("index");
	return mav;
	}


	@RequestMapping("/coffeeshop-form")
	public ModelAndView showForm() {
	ModelAndView mav = new ModelAndView("coffeeshopForm");
	return mav;
	}
	

	@RequestMapping("/coffeeshop-summary")
	public ModelAndView showSummary(
			@RequestParam("firstname")String firstname,
			@RequestParam("lastname")String lastname,
			@RequestParam("password")String password) {
		ModelAndView mav = new ModelAndView("summary");
	//	@RequestParam("firstname") String firstname;
	//	@RequestParam("lastname") String lastname;
	//	@RequestParam("password") String password;
	
	

	
	User user = new User();
	user.setFirstname(firstname);
	user.setLastname(lastname);
	user.setPassword(password);


 mav.addObject("user", user);
return mav;
	}
}
