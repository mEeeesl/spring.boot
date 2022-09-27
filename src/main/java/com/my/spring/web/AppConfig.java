package com.my.spring.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("ch01/main"); // request url이 "/"면, ViewName을 "ch01/main"으로 설정
	}
}

/*
ViewContrillerRegistry
> model없이 쓰는 view를 등록

Client ▶ request (url:"/") ▶ 
(Server)Dispatcher Servlet ("ch01/main"으로 파악) ▶ request 해석의뢰 ▶ 
View Resolver ▶ response (prefix, suffix 붙여서) ▶ 
Dispatcher ▶ request ▶ 
ch01/main이름을 갖는 servlet ▶ response ▶ Client
*/