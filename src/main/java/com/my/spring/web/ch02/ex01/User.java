package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter & Setter
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 파라미터를 갖는 생성자
public class User {
	private String userName;
	private int age;
}
