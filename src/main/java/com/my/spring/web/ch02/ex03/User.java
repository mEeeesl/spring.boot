package com.my.spring.web.ch02.ex03;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {  
	private String userName;
	private int age;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate regDate;
}

// name, date, id, number의 변수명은 업무명?과 연관지어서 이름지어라
// 객체 User를 Command로 사용하는걸 연습 (userName,age,regDate 말고 User객체를 넣을거임)