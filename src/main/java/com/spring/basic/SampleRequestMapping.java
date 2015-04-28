package com.spring.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")	// 클래스 위에 선언하면 아래 함수들은 모두 앞에 prefix로  /board 가 붙는다.
public class SampleRequestMapping {
	
	@RequestMapping("/delete") // class 앞에 RequestMapping 을 선언했기 때문에 /delete만 해준다
	public String view(){
		return "/board/delete"; // http://localhost:8888/basic/board/delete
	}
}
