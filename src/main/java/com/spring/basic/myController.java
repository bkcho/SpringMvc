package com.spring.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

	@RequestMapping("/board/update")
	public String view(){
		return "board/update";
	}
}
