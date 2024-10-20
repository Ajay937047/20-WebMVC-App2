package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {

	
	@GetMapping("/wish")
	public ModelAndView getWish() {
		System.out.println("getWish() :: called");
		ModelAndView md=new ModelAndView();
		md.addObject("msg", "All The Best  ...!!");
		md.setViewName("wish");
		return md;
	}
}
