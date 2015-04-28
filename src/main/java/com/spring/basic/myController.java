package com.spring.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 클래스를 따로 만들어서 @Controller을 선헌하면 사용할 수 있다.
public class myController {

	@RequestMapping("/board/update")
	public String view(){
		return "board/update";
	}
}
