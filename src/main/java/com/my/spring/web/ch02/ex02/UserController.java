package com.my.spring.web.ch02.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex02") // BeanId 중복방지
@RequestMapping("ch02/ex02") // ● 공통 URL
public class UserController {
	@GetMapping("userIn") // ● returnType = String, form 이며 view만 리턴 (model을 리턴할 상황이 아님)
	public String userIn() {
		return "ch02/ex02/userIn";
	}

}

/*
Controller 를 만들때 유일한 값 지정할 것
1. BeanId
2. request Mapping URL (Handler Mapping URL)
*/