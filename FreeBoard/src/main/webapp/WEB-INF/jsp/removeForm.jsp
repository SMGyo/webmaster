<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../includes/header.jsp"></jsp:include>
<h3>삭제화면(remove Form.jsp)</h3>

<%
String msg = (String) request.getAttribute("msg");
BoardVO board = (BoardVO) request.getAttribute("boardvo");
%>
<%
if (msg != null) {
%>
<p style="color: red;"><%=msg%></p>
<%
}
%>
<form action="removeBoard.do" method="post">
	<input type="hidden" name="bno" value="<%=board.getBoardNo()%>">
	<table class="table">
		<tr>
			<th>글번호</th>
			<td><%=board.getBoardNo()%></td>
			<th>조회</th>
			<td><%=board.getViewCnt()%></td>
		</tr>
		<tr>
			<td colspan="4" align="center"><input type="submit" value="삭제"
				class="btn btn-success"> <input type="reset" value="취소"
				class="btn btn-warning"></td>
		</tr>
	</table>
</form>

<jsp:include page="../includes/footer.jsp"></jsp:include>