package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public ModelAndView getIndex() {
		System.out.println("getIndex() :: called");
		ModelAndView md=new ModelAndView();
		md.setViewName("index");
		return md;
	}
}
