package com.my.spring.web.ch02.ex06;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex06")  			// DTO - Client || DOMAIN - DB
@RequestMapping("ch02/ex06")
public class UserController {
	@GetMapping("login")			//	▼ 선택사항으로 만들기	▼ 리퀘스트 파라미터명과 쿠키명이 일치해야함?
	public String loginIn(@CookieValue(required=false) String userId,
			@ModelAttribute("user") UserDto user) { // ◀ 기본 생성자 호출 + model이 됨(텅 빈 user를 생성해줌)
		if(userId != null) user.setUserId(userId); // userId가 선택사항이다보니까 if문 함.
		return "ch02/ex06/login";
	} // Cookie에대한 처리는 Handler에서 끝냄
	
	@PostMapping("login") // form action 값 설정				 ▼ @RequestParam 생략
	public String login(@ModelAttribute("user") UserDto user, String rememberMe, 
			HttpSession session, HttpServletResponse response) {// 선언만하면 넣어줌
		if(session.getAttribute("userId") == null) // 최초 로그인시,
			session.setAttribute("userId", user.getUserId()); // 값 넣어줌
		
		if(rememberMe != null && rememberMe.equals("on")) {
			Cookie cookie = new Cookie("userId", user.getUserId());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}

		return "ch02/ex06/logout";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	} // 하나의 업무가 끝나고 새로운 업무를 보기에, redirect로 구현한다.
}
	
	// ModelName = userdto -> "user" ( 사용자 지정 )
	// ModelValue = user?
	// user 객체 = Command 커맨드 (RequestParameter를 저장하는 객체) 
	// session 객체에 userId 유무로 로그인 여부 파악