package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/home")
public class NumController {
	@GetMapping("numIn")
	public String numIn() {
		return "ch02/home/numIn";
	}
	
	@GetMapping("numOut")	 //  ▼ 파라미터네임과 변수명을 동일하게
	public String numOut(Number num) {
		return "ch02/home/numOut";
	}
	
	// modelName = number
	// modelValue = num  ▶  numout.jsp 에서 읽어내는 값 ${number.num} 을 보내준다.
}
