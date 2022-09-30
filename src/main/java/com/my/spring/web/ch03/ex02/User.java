package com.my.spring.web.ch03.ex02;

import lombok.Data;

@Data
public class User { // Domain
	private String userName;
	private int age;
	private String faceFilename; // 서버(DB)와 대화할때 사용 - String 첨부파일의 파일명
}

/*
	파일에대해서는 DB에 파일명(FileName)을 insert 하는것이다.
*/