package com.my.spring.web.ch05.ex01;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.web.ch05.domain.User;

@RestController("ch05.ex01") // ● JSON을 return하는 Controller
@RequestMapping("ch05/ex01")
public class UserController {
	@GetMapping("main") // main 화면 요청하면,
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch05/ex01/main");
		return mv; // ● RestController에서 Model을 리턴.
	}
//    ▼method get  ▼URL get
	@GetMapping("get") // Get - Read
	public User get(User user) { // Parameter를 URL로 받음. @RequestParam 생략상태
		return user;
	} // 딱히 모 안해도 RestController는 지가 알아서 Json으로 변환해서 리턴함
	
	@PostMapping("post") // Post - Write
	public User post(@RequestBody User user) {
		return  user;
	}
	
	@PutMapping("put") // Put - fix ( request type이 put ) 
	public User put(@RequestBody User user) {
		return user;
	}
	// Put(많음) / Patch(적음) 차이 =  수정하는 양이 많고 적음.
	@PatchMapping("patch") // Patch - fix
	public User patch(@RequestBody User user) {
		return user;
	}
	
	@DeleteMapping("delete") // Delete - del
	public User delete(@RequestBody User user) {
		return user;
	}
}


/*
평범한 컨트롤러 핸들러가 작동할 시, 
Model과 View를 리턴.

지금 우리는 JSON을 return할 것이다. ( 클라이언트한테 JSON을 줄거임 ) 

1. Controller -> get & post
2. RestController -> get & post & put & pacth & delete

서버와 클라이언트랑 대화하며 주고받는 데이터타입은 JSON 이다.

클라이언트가 서버 핸들러한테 보내준 데이터를, 파라미터값으로 정하는 어노테이션.
	1. @PathVariable
	2. @RequestParam
	3. @Cookie Value
	4. @RequestBody

*/