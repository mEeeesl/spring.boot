package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("ch02.ex02") // BeanId 중복방지
@RequestMapping("ch02/ex02") // ● 공통 URL
public class UserController {
	@GetMapping("userIn") // ● returnType = String ▶ form 이며 view만 리턴할때 (model을 리턴할 상황이 아님)
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	/*
	@PostMapping("userOut") // request에 담긴 파라미터를 핸들러가 읽어내야함, 
	public String userOut(@RequestParam String userName, 
							@RequestParam int age, //파라미터명과 변수명을 일치시켜야함
							@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
							Model model) {
		model.addAttribute("user", new User(userName, age, regDate)); // model
		return "ch02/ex02/userOut"; // view
	}
	*/
	@PostMapping("userOut")
	public String userOut(String userName, 
							int age,
							@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
							Model model) {
		model.addAttribute("user", new User(userName, age, regDate)); // model
		return "ch02/ex02/userOut"; // view
		
		// @RequestParam을 안해도 작동함
		// String userName, int age, LocalDate regDate를 User객체로 넣으면 Command가 됨 ▶ ex03
	}
}

/*
Controller 를 만들때 유일한 값 지정할 것
1. BeanId
2. request Mapping URL (Handler Mapping URL)
*/