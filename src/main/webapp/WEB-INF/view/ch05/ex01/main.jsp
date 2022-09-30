<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<script>
	function init() {
		$('#getBtn').click(() => {
			$.ajax({		// ajax 통신 ( 비동기통신 ) 
				url: 'get',	// URL: 'get' ▶ 파라미터로 전달 ▶ @GetMapping("get")
				method: 'get',  // 기본값 = get, ( 안써도 적용 )
				data: {			// Json 형식의 data  
					userId: 1,	
					userName: '최한석',
					birthday: '2022-09-30'
				},
				contentType: 'application/x-www-form-urlencoded' // 리퀘스트에 담을 contentType?
			}).done(user => console.log(user)) // 서버 쪽에서 보내준 data가 user에 담을거임
		})
		
		$('#postBtn').click(() => {
			$.ajax({
				url: 'post',
				method: 'post',
				data: JSON.stringify({ // Object -> JSON 으로 변환 후 RequestBody에 담길거임 
					userId: 2,
					userName: '한아름',
					birthday: '2022-09-30'
				}),
				contentType: 'application/json'
			}).done(user => console.log(user)) // 클라이언트는 user Object를 받게됨
		})
		
		$('#putBtn').click(() => {
			$.ajax({
				url: 'put',
				method: 'put',
				data: JSON.stringify({
					userId: 3,
					userName: '양승일',
					birthday: '2022-09-30'
				}),
				contentType: 'application/json'
			}).done(user => console.log(user))
		})
		
		$('#patchBtn').click(() => {
			$.ajax({
				url: 'patch',
				method: 'patch',
				data: JSON.stringify({
					userId: 4,
					userName: '김가람',
					birthday: '2022-09-30'
				}),
				contentType: 'application/json'
			}).done(user => console.log(user))
		})
		
		$('#delBtn').click(() => {
			$.ajax({
				url: 'delete',
				method: 'delete',
				data: JSON.stringify({
					userId: 5,
					userName: '박돈일',
					birthday: '2022-09-30'
				}),
				contentType: 'application/json'
			}).done(user => console.log(user))
		})
	}
	
	$(init)
</script>

<nav>
	<button type='button' id='getBtn'>GET</button>
	<button type='button' id='postBtn'>POST</button>
	<button type='button' id='putBtn'>PUT</button>
	<button type='button' id='patchBtn'>PATCH</button>
	<button type='button' id='delBtn'>DEL</button>
</nav>