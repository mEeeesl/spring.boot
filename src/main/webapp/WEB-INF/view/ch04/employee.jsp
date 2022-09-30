<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
${employee.employeeId} / ${employee.lastName} / ${employee.hireDate}

<!--
	 ● ModelName & AttributeName = employee
		.employeeId = getEmployeeId()
		.lastName = getLastName()
		.hireDate = getHireDate()
		
	Mybatis는 Setter를 알아서 잘함 - ( OR Mapping할때 ? )
-->
