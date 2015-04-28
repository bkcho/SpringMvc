package com.spring.basic;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // 이 자바 파일은 컨트롤러가된다.
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/board/view")  //http://localhost:8888/basic/board/view
	public String view(){
		return "board/view";
	}
	
	@RequestMapping("/board/content")	// http://localhost:8888/basic/board/content
	public String content(Model model){
		model.addAttribute("id", 30);
		return "board/content";
	}
	
	@RequestMapping("/board/reply")	// http://localhost:8888/basic/board/reply
	public ModelAndView reply() {
		ModelAndView mv = new ModelAndView(); // Model 인자를 받지 않고 사용하는 방법
		mv.addObject("id",30);
		mv.setViewName("board/reply");
		return mv;
	}
	
	@RequestMapping("board/confirmid") // http://localhost:8888/basic/board/confirmid?id=ppusari&pw=1234
	public String confirmid(HttpServletRequest httpServletRequest, Model model){
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/confirmid";
	}
	
	// 주소 파라미터값이 없으면 400 에러가 난다.
	@RequestMapping("board/checkid") // http://localhost:8888/basic/board/checkid?id=test&pw=12345
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model){

		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		return "board/checkid";
	}
	
	
}
