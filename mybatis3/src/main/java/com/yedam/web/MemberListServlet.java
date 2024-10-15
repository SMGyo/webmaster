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

@WebServlet("/MemberListServlet")
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
		
		out.print("<table>");
		for(Member member : members) {
			out.print("<tr>");
			out.print("<td>"+member.getMemberId()+"</td>");
			out.print("<td>"+member.getPassword()+"</td>");
			out.print("<td>"+member.getMemberName()+"</td>");
			out.print("<td>"+member.getPhone()+"</td>");
			out.print("<td>"+member.getResponsibility()+"</td>");
			out.print("<td>"+member.getCreationDate()+"</td>");
			out.print("</tr>");
		}
		out.print("</table");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	}

}
