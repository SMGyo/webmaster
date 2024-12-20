package com.yedam.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.common.Control;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;

public class EventControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/json;charset=utf-8");
		String job = req.getParameter("job");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(job);
		BoardService svc = new BoardServiceImpl();
		List<Map<String, Object>> list = svc.eventList();
		String json = gson.toJson(list);
		
		
		json = gson.toJson(list);
		resp.getWriter().print(json);

	}// end of exec.

}
