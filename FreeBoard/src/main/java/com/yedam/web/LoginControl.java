package com.yedam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;

public class LoginControl implements Control {
	
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		//loginForm.jsp
		

		
		if(req.getMethod().equals("GET")) {
			req.getRequestDispatcher("WEB-INF/jsp/loginForm.jsp").forward(req, resp);
		}else if (req.getMethod().equals("POST")) {
			
			MemberService svc = new MemberServiceImpl();
			String id = req.getParameter("logId");
			String pw = req.getParameter("logPw");
			//로그인실패.
			if(svc.loginCheck(id, pw)==null) {
				req.setAttribute("msg", "아이디와 비밀번호를 확인하세요");
				req.getRequestDispatcher("WEB-INF/jsp/loginForm.jsp").forward(req, resp);
				return;
			}
			//정상로그인. session객체.
			HttpSession session = req.getSession();
			session.setAttribute("logId", id);
			
			resp.sendRedirect("boardList.do");
		}
	}
}
