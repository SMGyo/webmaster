<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.yedam.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
.reply span {
display: inline-block;
}
.reply ul{
list-style: none;
}
</style>
<jsp:include page="../includes/header.jsp"></jsp:include>
<%
BoardVO board = (BoardVO) request.getAttribute("boardvo");
String pg = (String) request.getAttribute("page");
String sc = (String) request.getAttribute("searchCondition");
String kw = (String) request.getAttribute("keyword");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<style>
table {
	background-color: yellowgreen;
}
</style>
<h3>상세페이지(board.jsp)</h3>

<table class="table">
	<tr>
		<th>글번호</th>
		<td><%=board.getBoardNo()%></td>
		<th>조회수</th>
		<td><%=board.getViewCnt()%></td>
	</tr>
	<tr>
		<th>제목</th>
		<td><%=board.getTitle()%></td>
		<th>작성자</th>
		<td><%=board.getWriter()%></td>
	</tr>
	<tr>
		<th>내용</th>
		<td colspan="3"><textarea readonly rows="4" cols="30"
				class="form-control"><%=board.getContent()%></textarea></td>
	</tr>
	<tr>
		<th>이미지</th>
		<td colspan="3">
			<%
			if (board.getImg() != null) {
			%> <img src="images/<%=board.getImg()%>" width="100px">
		</td>
		<%
		}
		%>
	</tr>
	<tr>
		<th>작성일시</th>
		<td colspan="3"><%=board.getWriteDate()%></td>
	</tr>
	<tr>
		<td align="center" colspan="4"><input type="button" value="수정"
			class="btn btn-warning"> <input type="button" value="삭제"
			class="btn btn-danger"></td>
	</tr>
</table>

<!-- 댓글관련. -->
<div class="container reply">
	<!-- 댓글등록. -->
	<!-- 댓글목록. -->
	<div class="content">
		<ul>
			<li><span class="col-sm-2">글번호</span> <span class="col-sm-5">내용</span>
				<span class="col-sm-2">작성자</span> <span class="col-sm-2">삭제</span></li>
			<!-- <li><span class="col-sm-2">3</span> <span class="col-sm-5">댓글입니다</span>
				<span class="col-sm-2">user01</span> <span class="col-sm-2"><button>삭제</button></span></li> -->
		</ul>
	</div>
	<!-- 댓글페이징. -->
</div>



<jsp:include page="../includes/footer.jsp"></jsp:include>
<script>
	const bno = "${boardvo.boardNo }"; console.log(bno);
	document.querySelector('input[value="수정"]').addEventListener('click',
			function(e) {
		location.href = 'modifyBoard.do?page=<%=pg%>&bno=<%=board.getBoardNo()%>';
			});
//location.href = 'modifyBoard.do?searchCondition=${searchCondition }&keyword=${keyword}&page=${page}&bno=${bno}'
	document.querySelector('input[value="삭제"]').addEventListener('click',
			function(e) {
		location.href = 'removeBoard.do?page=<%=pg%>&bno=<%=board.getBoardNo()%>
	';
					});
</script>

<script src="js/replyService.js"></script>
<script src="js/reply.js"></script>