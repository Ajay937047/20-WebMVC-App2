package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FisrtWebController {
	
	

	@GetMapping("/welcome")
	public ModelAndView getWlcPage() {
		System.out.println("getWlcPage():: called");
		ModelAndView md = new ModelAndView();
		md.addObject("welcomeMsg", "WELCOME TO STUDENT INFORMATION ...!!");
		md.setViewName("welcome");
		return md;
	}

	@GetMapping("/greet")
	public ModelAndView getMsg() {
		System.out.println("getMsg() :: called");
		ModelAndView md = new ModelAndView();
		md.addObject("greetMsg", "Hi Good Morning ...!!");
		md.setViewName("greet");
		return md;
	}

}
