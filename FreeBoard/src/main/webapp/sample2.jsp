<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<title>jQuery Element Selection</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
	// document.addEventListener('DOMContentLoaded', function(e) {})
	/*$(document).ready(function() {
		$("body p").on("click", function() { // <p>요소를 모두 선택함.
			$("span").css("fontSize", "28px"); // <span>요소를 모두 선택함.
		});
	});*/
	//$() 함수에 전달되는 인수는 반드시 따옴표("")를 사용한 문자열 형태로 전달되어야 합니다.
	document.addEventListener('DOMContentLoaded', function(e) {
		document.querySelectorAll('p').forEach(item => {
			item.addEventListener('click', function(e){
				// 화면상의 <span></span>
				//document.querySelectorAll('span').forEach(span => {
					this.querySelector('span').style.fontSize = '28px';
				//})
			})
		})
	})
</script>
</head>

<body>

	<h1>HTML</h1>

	<p>
		이제부터 <span>제이쿼리</span>를 다 같이 공부해보죠!!<br> 마우스로 글씨를 클릭해보세요!!
	</p>
	<p>
		이제부터 <span>제이쿼리</span>를 다 같이 공부해보죠!!<br> 마우스로 글씨를 클릭해보세요!!
	</p>
	<p>
		이제부터 <span>제이쿼리</span>를 다 같이 공부해보죠!!<br> 마우스로 글씨를 클릭해보세요!!
	</p>
		이제부터 <span>제이쿼리</span>를 다 같이 공부해보죠!!<br> 마우스로 글씨를 클릭해보세요!!

</body>

</html>