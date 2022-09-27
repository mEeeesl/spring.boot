package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter & Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String userName;
	private int age;
}
