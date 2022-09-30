package com.my.spring.web.ch02.home;

import lombok.Setter;

@Setter
public class Number {
	private double num;
	
	public double getNum() { 
		return num + (int)(Math.random() * 10) / 10.0;
	}
	
	// 간단한 로직 + 도메인이 갖는 알고리즘은, 도메인에 구현해라.
}
