<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='checkbox' method='post'>
	<label><input type='checkbox' name='fruit' value='사과'/>사과</label>
	<label><input type='checkbox' name='fruit' value='포도'/>포도</label>
	<label><input type='checkbox' name='fruit' value='딸기'/>딸기</label>
	<input type='submit'/>
</form>

<!-- 
	checkbox는 파라미터 갯수가 n개임
	n개를 담을 ArrayList를 이용
	
	※ 
	List - interface - 정적배열 - 일단 배열이 만들어지면 크기가 커질 수 없음 
	ArrayList - class - 동적배열 - 필요할 때 커지고 작아질 수 있음
	
	1. 동적배열에 담기. 
	> fruit => 사과, 포도 선택
	> ArrayList<String> fruits에 담기
	근데 여러개 선택해도 1개만 담김.
	
	극복방법
	> fruits.add(fruit);
	
 
 -->