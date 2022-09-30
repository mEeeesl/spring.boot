<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form method='post'>
	ID: <input type='text' name='userId' value='${user.userId}'/> 
	PW: <input type='password' name='pw'/>
	<input type='checkbox' name='rememberMe'/>아이디 저장
	<input type='submit' value='로그인'/>
</form>

<!-- 
	formaction을 지정해주지 않으면, 현재 이 페이지가 action값이다.
	ch02/ex06/login 

-->