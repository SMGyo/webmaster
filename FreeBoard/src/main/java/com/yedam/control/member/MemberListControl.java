package com.yedam.control.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;
import com.yedam.vo.MemberVO;

public class MemberListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("MemberListControl");
		MemberService svc = new MemberServiceImpl();
		List<MemberVO> list = svc.memberList();

		req.setAttribute("memberList", list);

		try {
			// memberList.do 로 요청된 페이지에서 memberList.jsp 요청재지정.
			req.getRequestDispatcher("admin/memberList.tiles").forward(req, resp);
			//webapp에 직접접근할수있는건 index.jsp
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
