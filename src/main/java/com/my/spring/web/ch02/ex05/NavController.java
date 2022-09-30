package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() { // ch02/ex05/forward로 입력하면 target으로 이동
		return "forward:target"; // forward 핸들러에서 target 핸들러로 이동시킴 
	} // return "target"; ▶ URL이 아닌, View Name 으로 인식한다. 
	  // 접두사 'forward:'를 붙여주면 target은 URL이 된다.
	  // forward는 URL이 forward URL을 사용한다.
		
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";
	} // redirect:target ▶ response 내장객체에 URL이 담긴다.
	
	//과제: contextPath 후 주소로 'ch02/ex05/naver'를 입력하면, naver 뜨게 핸들러 구현
	
	@GetMapping("naver")
	public String naver() {
		return "redirect:https://naver.com";
	}	
}
