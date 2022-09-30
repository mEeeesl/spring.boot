package com.my.spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Value("${attachPath}") // property Name 지정
	private String attachPath; // property에 저장할 변수 선언
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("ch01/main"); // request url이 "/"면, ViewName을 "ch01/main"으로 설정
		// registry.addViewController("ch02/ex03/user").setViewName("ch02/ex03/userIn");
		// userIn과 userOut의 URL이 동일하고, UserController가 있다면, 컨트롤러를 우선적으로 실행함
		// => UserController에 @GetMapping과 @PostMapping을 지우면 12번째줄이 실행됨
	}
	
	@Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	      registry.addResourceHandler("res/**").addResourceLocations("WEB-INF/res/");
	      registry.addResourceHandler("attach/**").addResourceLocations("file:///" + attachPath + "/");  
		// Context Path 후 URL이, 'res'로 시작하는 무엇이든지를 -> 리소스핸들러 -> WEB-INF/res/로 바꿔버리고
		// -> Default Servlet(Tomcat)에게 넘기고, duke.gif를 찾아서 담고, Client에게 넘김
 	    // 25줄 코드 ->첨부파일은 app 외부(밖)에있다. 파일생성작업은 window가 하기에, window가 알 수있게 지정해줘야한다.
	      
	}
}

/*
ViewControllerRegistry
> model없이 쓰는 view를 등록

1. Client ▶ request (url:"/") ▶ 
2. (Server)Dispatcher Servlet ("ch01/main"으로 파악) ▶ request 해석의뢰 ▶ 
3. View Resolver ▶ response (prefix, suffix 붙여서) ▶ 
4. Dispatcher ▶ viewName을 파악 후, request ▶ 
5. ch01/main.jsp이름을 갖는 Servlet(View) ▶ response ▶ 
6. Dispatcher Servlet ▶ response ▶ View - (WEB-INF/view/ch01/main.jsp) ▶ Client

"/" url과
"ch01/main" ViewName을
ViewController에 등록시켜서 View로 이용하고,

Handler = Controller가 갖고있는 Method이다.

res 폴더에 몰아넣고 리소스핸들러 1개 준비하던지,
res 폴더 5개 만들고 리소스 핸들러 5개 준비하던지.
*/
