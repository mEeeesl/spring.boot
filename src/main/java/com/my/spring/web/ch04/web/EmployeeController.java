package com.my.spring.web.ch04.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.my.spring.web.ch04.domain.Employee;
import com.my.spring.web.ch04.service.EmployeeService;
// presentation 레이어
@Controller
public class EmployeeController {
	@Autowired private EmployeeService employeeService;
 // Path Variable(변수) - 동적으로 바뀜 - URL의 일부로 포함시키는게 깔끔하다.
	@GetMapping("ch04/employee/{employeeId}") // ← {} = PV, ↙ 변수명과 일치시키기.
	public String getEmployee(@PathVariable int employeeId, Model model) {
		Employee employee = employeeService.getEmployee(employeeId);
		model.addAttribute("employee", employee);
		
		return "ch04/employee";
	}
}

/*
	클라이언트가 서버 핸들러한테 보내준 데이터를, 파라미터값으로 정하는 어노테이션.
	1. @PathVariable
	2. @RequestParam
	3. @Cookie Value
	4. @RequestBody
model은 서버(핸들러) 내부에서 관리하는것 ?
 
Attribute = model인데, 클라이언트가 받는 것(view에서 사용하는 model)
- request scope의 Attribute
*/