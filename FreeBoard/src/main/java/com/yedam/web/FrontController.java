package com.yedam.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

@WebServlet("*.do") // 무슨 내용이 들어가도 .do 있으면 실행이됨
public class FrontController extends HttpServlet {
	Map<String, Control> map;

	public FrontController() {
//		System.out.println("객체생성");
		map = new HashMap<>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {// init 최초실행에만
//		System.out.println("init호출");
		map.put("/memberList.do", new MemberListControl());
		// 회원등록 1)등록화면 2)등록처리
		map.put("/memberAddForm.do", new MemberAddFormControl());
		map.put("/memberAdd.do", new MemberAddControl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("service호출");
		// 요청페이지?
		String uri = req.getRequestURI(); // http://localhost/FreeBoard/add.do =>/FreeBoard/add.do
		String context = req.getContextPath(); // /FreeBoard
		String page = uri.substring(context.length()); // /add.do

		Control control = map.get(page);
		control.exec(req, resp);
	}
}
