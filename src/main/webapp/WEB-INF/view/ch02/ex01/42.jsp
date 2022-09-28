<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
${user.userName} / ${user.age} / ${man.userName} / ${man.age}

<!-- 

localhost/ch02/ex01/11 이거 주소창에 입력하면 뜸  
Servlet은 파라미터와 어트리뷰트가 있는데,
 
ModelAndView는 Servlet 관점에선 Attribute. ( Server(Dispatcher) 한테 객체를 받아서 )
Attribute Name은 mv  

user.jsp는 attribute를 받은거다.
받은 attribute의 name이 user이고,
최한석, 11은 value다.

※ 변수명과 칼럼명 지을때,
name, id, number, date는 단독으로 사용하지않는다. 

업무명 지을때 ?
laborer/add ?
 -->