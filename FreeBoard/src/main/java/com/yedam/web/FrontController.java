package com.yedam.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.control.CalendarCont;
import com.yedam.control.ChartControl;
import com.yedam.control.CountWriterCont;
import com.yedam.control.EventControl;
import com.yedam.control.JavaScriptCont;
import com.yedam.control.addEventControl;
import com.yedam.control.board.AddBoardControl;
import com.yedam.control.board.AddBoardForm;
import com.yedam.control.board.BoardControl;
import com.yedam.control.board.BoardListControl;
import com.yedam.control.board.ModifyBoardControl;
import com.yedam.control.board.RemoveBoardControl;
import com.yedam.control.member.AddMemberCont;
import com.yedam.control.member.DelMemberCont;
import com.yedam.control.member.LogOutControl;
import com.yedam.control.member.LoginControl;
import com.yedam.control.member.MemberAddControl;
import com.yedam.control.member.MemberAddFormControl;
import com.yedam.control.member.MemberJsonCont;
import com.yedam.control.member.MemberListControl;
import com.yedam.control.reply.AddReplyCont;
import com.yedam.control.reply.RemoveReplyCont;
import com.yedam.control.reply.ReplyCountCont;
import com.yedam.control.reply.ReplyListCont;

//@WebServlet("*.do") // 무슨 내용이 들어가도 .do 있으면 실행이됨
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

		// 게시판 관련.
		map.put("/boardList.do", new BoardListControl()); // 목록
		map.put("/board.do", new BoardControl()); // 상세
		// 글등록 (등록화면 -> 등록처리)
		map.put("/addBoardForm.do", new AddBoardForm());// 등록화면
		map.put("/addBoard.do", new AddBoardControl());// 등록처리
		// 글수정 (수정화면 -> 변경처리)
		map.put("/modifyBoard.do", new ModifyBoardControl());
		// 글삭제
		map.put("/removeBoard.do", new RemoveBoardControl());
		// 로그인
		map.put("/loginForm.do", new LoginControl());
		map.put("/logOutForm.do", new LogOutControl());

		map.put("/javascript.do", new JavaScriptCont());

		// json 관련
		map.put("/memberJson.do", new MemberJsonCont());
		map.put("/addMemberJson.do", new AddMemberCont());
		map.put("/removeMemberJson.do", new DelMemberCont());

		// 댓글관련
		map.put("/replyList.do", new ReplyListCont());
		map.put("/removeReply.do", new RemoveReplyCont());
		map.put("/addReply.do", new AddReplyCont());
		map.put("/replyCount.do", new ReplyCountCont());
		
		//차트
		map.put("/chart.do",new ChartControl());
		map.put("/countByWriter.do", new CountWriterCont());
		
		//캘린더
		map.put("/calendar.do", new CalendarCont());
		map.put("/eventList.do", new EventControl());
		map.put("/addEvent.do", new addEventControl());
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
