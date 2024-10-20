package in.ashokit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.StudentRegistrationBinding;
import in.ashokit.entity.StudentEntity;
import in.ashokit.entity.StudentRegistrationEntity;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
		
	
		
	@GetMapping("/studentlist")
	public ModelAndView getStudentList() {
		System.out.println("getStudentList() :: called");
		List<StudentEntity> getstudentlist = service.getstudentlist();
		ModelAndView md=new ModelAndView();
	    md.addObject("studentlistk", getstudentlist);
	    md.setViewName("studentlist");
	    System.out.println("Studentlist :" +getstudentlist);
		return md;
	}
	
	
	@GetMapping("/registerlist")
	public ModelAndView getRegisterList() {
		List<StudentRegistrationEntity> registerList = service.getRegisterList();
		ModelAndView md=new ModelAndView();
		md.addObject("registerlist", registerList);
	    md.setViewName("registerlist");
		return md;
	}
	
	
}
