package com.yedam.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.dao.MemberMapper;
import com.yedam.vo.Member;

//IOC (제어의 역전)
//객체생성 -> init() -> service() -> destroy() : 서블릿의 생명주기.

@WebServlet("/MemberListServlet") // url
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberListServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		SqlSession sqlSession = DataSource.getInstance().openSession(true);
		PrintWriter out = response.getWriter();
		MemberMapper dao = sqlSession.getMapper(MemberMapper.class);

		List<Member> members = dao.members();
		out.print("<style>");
		out.print("table {" + "border : 1px solid black;");
		out.print("tr {" + "border : 1px solid black;");
		out.print("td {" + "border : 1px solid black;");
		out.print("</style>");
		out.print("<table>");
		String str = "<h3>회원정보</h3>";
		str += "<h3>회원목록</h3>";
		str += "<thead><tr><th>회원아이디</th><th>회원명</th><th>연락처</th></tr></thead>";
		str += "<tbody>";
		for (Member member : members) {
			str += "<tr><td><a href='member.action?mid=" + member.getMemberId() + "'>" + member.getMemberId()
					+ "</a></td><td>" + member.getMemberName() + "</td><td>" + member.getPhone() + "</td></tr>";
		}
		str += "</tboby>";
		str += "</table>";
		str += "<a href='./'>첫페이지</a>";
		out.print(str);
//		for(Member member : members) {
//			out.print("<tr>");
//			out.print("<td>"+member.getMemberId()+"</td>");
//			out.print("<td>"+member.getPassword()+"</td>");
//			out.print("<td>"+member.getMemberName()+"</td>");
//			out.print("<td>"+member.getPhone()+"</td>");
//			out.print("<td>"+member.getResponsibility()+"</td>");
//			out.print("<td>"+member.getCreationDate()+"</td>");
//			out.print("</tr>");
//		}
		out.print("</table");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
	}

}
