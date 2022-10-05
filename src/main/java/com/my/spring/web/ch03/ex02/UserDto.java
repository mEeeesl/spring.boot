package com.my.spring.web.ch03.ex02;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserDto {
	private String userName;	// 파라미터 value = 변수
	private int age;
	private MultipartFile face;	// 파라미터 value = binary
								// 클라이언트와 대화할 때 사용 - 첨부파일 타입 ( 첨부파일 저장 )
								// 첨부파일은 데이터타입일뿐이다. ( 기능을 구현한건 아니다 )
								// 프로젝트할때 첨부파일 기능구현이 아니라 회원가입 기능구현 이런식으로 하래
}
