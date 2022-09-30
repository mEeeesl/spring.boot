package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex03") // 패키지.패키지.패키지
@RequestMapping("ch02/ex03/user") // 폴더/폴더/폴더
public class UserController {
	@GetMapping 			 // <- 저기 괄호에 아무것도 안썼으니,
	public String userIn() { // "ch02/ex03/user" = RequestMapping URL = HandlerMapping URL
		return "ch02/ex03/userIn";
	} // view만 원하니 returnType = String 
	
	@PostMapping		// ▼ request 관점에서, name,age,regDate대신,
	public String userOut(User user) { // 객체를 넣었으니 Command가 되는것이다.
		return "ch02/ex03/userOut";
	}
	// Command 이자, Model이 됨. ('user'가 model로 자동지정 됨)
	// Model Name = user ▶ userOut.jsp에서 출력하기위한 모델명.모델속성
}

/*
request Mapping URL (Handler Mapping URL)은 유일해야하지만,
userIn(), userOut의 URL은 ch02/ex03/user로 같음

GetMapping과 PostMapping 이기에 괜찮음.
URL이 같으니 하나의 업무구나 라고 파악할 수 있어서 효율적이다.
*/