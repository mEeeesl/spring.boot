package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {  
	private String userName;
	private int age;
	private LocalDate regDate;
}

// name, date, id, number의 변수명은 업무명?과 연관지어서 이름지어라
// 리퀘스트 안에 들어있는 파라미터를 꺼내서 이용하고싶어 그걸 연습