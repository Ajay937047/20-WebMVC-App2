package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.StudentRegistrationBinding;
import in.ashokit.entity.StudentRegistrationEntity;
import in.ashokit.service.StudentRegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private StudentRegistrationService studentRegistrationService;

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		/*
		 * StudentRegistrationBinding studentbinding = new StudentRegistrationBinding();
		 * model.addAttribute("registration", studentbinding);
		 */
		return "register";
	}

	@PostMapping("/registration")
	public String registerStudent(@ModelAttribute StudentRegistrationBinding student, Model model) {

		System.out.println("student:" + student);
		System.out.println("module:" + model);

		StudentRegistrationEntity registerUser = studentRegistrationService.registerUser(student);
		if (registerUser != null) {
			ModelAndView md = new ModelAndView();
			md.addObject("successmessage", " Registration successfull... ");
			return "registersucces";
		}
		return "failed";

	}

	

}
