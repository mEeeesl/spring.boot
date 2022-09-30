package com.my.spring.web.ch04.domain;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Employee {
	private int employeeId;
	private String lastName;
	private LocalDate hireDate;
}


/*
	1. Mybatis는 Setter를 알아서 잘함 - ( OR Mapping할때 ? )

	2. application.properties 에
	mybatis.configuration.map-underscore-to-camel-case=true

	> 	employee_id => emplooyeId
		last_name => lastName
		hire_date => hireDate

	>	underscore를 camel style로 바꿔주는거다. 

*/