package com.spring.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")	// Ŭ���� ���� �����ϸ� �Ʒ� �Լ����� ��� �տ� prefix��  /board �� �ٴ´�.
public class SampleRequestMapping {
	
	@RequestMapping("/delete") // class �տ� RequestMapping �� �����߱� ������ /delete�� ���ش�
	public String view(){
		return "/board/delete"; // http://localhost:8888/basic/board/delete
	}
}
