<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<img src='<c:url value="/attach/${user.faceFilename}"/>'/><br>
${user.userName} / ${user.age}


<!-- 
	예제에서는 서버에 뭐 있고 서버에 파일을 요청하는거래
	실제는 안그렇대
 -->
