package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.service.DynamicSearchService;

@Controller
public class DeleteController {

	@Autowired
	private DynamicSearchService dynamicSearchService;
	
	
	 @GetMapping("/deleteStudent")
	    public ModelAndView deleteStudent(@RequestParam("studentId") int studentId) {
	        boolean isDeleted = dynamicSearchService.deleteStudent(studentId);
	        
	        if (isDeleted) {
	        	ModelAndView mav = new ModelAndView();
	        	mav.setViewName("register_result");
	            return mav;
	        } else {
	        	ModelAndView mav = new ModelAndView();
	            mav.setViewName("register_result");
	            return mav;
	        }
	        
	    }
}
