package com.my.spring.web.ch05.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data // Setter 및 생성자 준비
public class User {
	private int userId;
	private String userName;
	@DateTimeFormat(pattern="yyyy-MM-dd") // String을 LocalDate로
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asis/Seoul") // LocalDate를 JSON으로 ( 클라이언트한테 보내줄때 쓰인다함 )
	private LocalDate birthday;
}

/*
	JACKSON 라이브러리를 이용했음.
	( LocalDate -> JSON type )  
	command & model로 쓸거임

*/