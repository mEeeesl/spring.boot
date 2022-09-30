<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form method='post' encType='multipart/form-data'> <!-- 파라미터밸류가있다면?? encoding type을 사용해야한다 -->
	<label>이름: <input type='text' name='userName'/></label>
	<label>나이: <input type='number' name='age'/></label>
	<label>얼굴: <input type='file' name='face'/></label>
	<input type='submit'/>
</form>