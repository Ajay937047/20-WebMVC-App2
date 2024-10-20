package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public ModelAndView add(@RequestParam double num1, @RequestParam double num2) {
    	
    	ModelAndView md= new ModelAndView();
    	md.addObject("calculateresults",num1+num2);
    	md.setViewName("calculateresult");
        return md;
    }

    @GetMapping("/subtract")
    public ModelAndView subtract(@RequestParam double num1, @RequestParam double num2) {
    	ModelAndView md= new ModelAndView();
    	md.addObject("calculateresults",num1-num2);
    	md.setViewName("calculateresult");
        return md;
    }

    @GetMapping("/multiply")
    public ModelAndView multiply(@RequestParam double num1, @RequestParam double num2) {
    	ModelAndView md= new ModelAndView();
    	md.addObject("calculateresults", num1*num2);
    	md.setViewName("calculateresult");
        return md;
    }

    @GetMapping("/divide")
    public ModelAndView divide(@RequestParam double num1, @RequestParam double num2) {
    	 ModelAndView md= new ModelAndView();
    	if (num2 == 0) {
        	md.addObject("calculateresults", "Cannot divide by zero");
        	md.setViewName("calculateresult"); 	
            return md;
        }
    	md.addObject("calculateresults", num1 / num2);
    	md.setViewName("calculateresult");
        return md;
    }
}
