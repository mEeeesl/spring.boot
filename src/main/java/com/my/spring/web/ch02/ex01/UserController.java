package com.my.spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ch02/ex01") // ● 공통 URL
public class UserController { // ● returnType = ModelAndView , localhost/ch02/ex01/11 
	@GetMapping("11") // ● 고유 URL, handler11이 받는 request 종류를 골라서 써야한다. ( url은 ContextPath 이후의 url )
	public ModelAndView handler11(ModelAndView mv) { // url이 Mapping되어있음, Handler Mapping Bean이 관리함
		mv.addObject("user", new User("최한석", 11));
		mv.setViewName("ch02/ex01/user");
		
		return mv; // handler가 ModelAndView를 리턴하고 업무종료. 
				   // Dispatcher가 Handler를 call하고, mv를 Dispatcher가 리턴받음
				   // Dispatcher는 View Resolver 한테 request 해석요청
	}
	
	// view나 model 1개를 여러 핸들러가 공유(user.jsp)해서 사용가능하다.
	// 핸들러 만드는 옛날 방법
	@GetMapping("21") // ● returnType = String , localhost/ch02/ex01/21
	public String handler21(Model model) { // Container가 Model Type의 객체를 만들어서 넣어줌
		model.addAttribute("user", new User("한아름", 21));
		return "ch02/ex01/user"; //이 값을 ViewName으로 씀
	}
	
	@GetMapping("22")
	public String handler22() { // model은 안보여주고 view만 보여줌, 창에 '/' 이것만 달랑나옴
		return "ch02/ex01/user";
	}
	
	@GetMapping("31") // ● returnType = void
	public void handler31(User user) { // 파라미터로 Domain - Container가 User 객체를 만들어서 넣어줌 ( 기본생성자로 - @NoArgsConstructor )
		user.setUserName("양승일"); // 멤버변수 선언
		user.setAge(31);
		/* ModelName = 클래스명 User
		   ModelValue = user
		   ViewName = ch02/ex01/31 */
	}
	
	@GetMapping("32")	  // ▼ ModelName 설정
	public void handler32(@ModelAttribute("man") User user) {
		user.setUserName("서준한");
		user.setAge(32);
		/* ModelName = man
		   ModelValue = user	
		   ViewName = localhost/ch02/ex01/32 */ 
	}
	
	@GetMapping("41") // ● returnType = model
	public User handler41(User user) {
		user.setUserName("김가람");
		user.setAge(41);
		
		return user;
		/* ModelName = user(returnType) 
		 * ModelValue = user
		   ViewName = localhost/ch02/ex01/41 */
	}
	
	@GetMapping("42") 
	@ModelAttribute("man") // ModelName 지정
	public User handler42(User user) {
		user.setUserName("박건우");
		user.setAge(42);
	
		return user;
		/* ModelName & AttributeName = man
		   ModelValue = user */
	}
}

/*

※ class 만들때 유의사항. ※

도메인명 + Map 
도메인명 + Dao 

업무명 + Service

Dao와 Service 는 request 안받고
MVC는 Client와 request를 받고 response도 보내주고 해야함

Dispatcher가 request를 혼자 다 받는거임.
Controller는 request를 직접받진 않고,
request에 해당하는 method를 골라서 call될거임
 
Handler가 request를 받지는 않고, 처리는 함.
Handler = Controller가 갖고있는 Method

Handler Mapping Bean이 UserController의 handler11이야 라고 알려주면,
Dispatcher가 실행,?

User Controller가 작업을 끝내면, 
Dispatcher한테 Model과 View를 Mapping해서 리턴해줌,

ModelAndView는 Controller(Container)가 만들어줌

1. Client ▶ request (url:"/") ▶ 
2. (Server)Dispatcher Servlet ("ch01/main"으로 파악) ▶ request 해석의뢰 ▶ 
3. View Resolver ▶ response (prefix, suffix 붙여서) ▶ 
4. Dispatcher ▶ viewName을 파악 후, request ▶ 
5. ch01/main.jsp이름을 갖는 Servlet(View) ▶ response ▶ 
6. Dispatcher Servlet ▶ response ▶ View - (WEB-INF/view/ch01/main.jsp) ▶ Client
*/