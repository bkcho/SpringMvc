package com.spring.basic;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/studentForm")
	public String studentForm(){
		return "createPage";
	}
	
	@RequestMapping("/student/create")
	public String studentCreate(@ModelAttribute("student") Student student, BindingResult result){
		
		String page = "createDonePage";
 		
		StudentValidator studentValidator = new StudentValidator();
		studentValidator.validate(student, result);
		if (result.hasErrors()){
			page = "createPage";
		}
		
		return page;
	}
}
