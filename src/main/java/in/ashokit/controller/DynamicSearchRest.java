package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.ReportBinding;
import in.ashokit.binding.StudentRegistrationBinding;
import in.ashokit.service.DynamicSearchService;

@Controller
public class DynamicSearchRest {

	@Autowired
	private DynamicSearchService dynamicservice;
	
	@GetMapping("searching")
	public String search(Model model) {
		return "dynamicsearch";
	}
	

	@PostMapping("/search")
	public ModelAndView getStatus(@ModelAttribute ReportBinding dinding, Model model) {
		List<StudentRegistrationBinding> getlist = dynamicservice.getlist(dinding);
		ModelAndView md=new ModelAndView();
		md.addObject("register_results", getlist);
		md.setViewName("register_result");
		return md;
	}
	
	
	
	

}
