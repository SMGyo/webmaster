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

public class addEventControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 등록
		resp.setContentType("text/json;charset=utf-8");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String title = req.getParameter("title");
				String start = req.getParameter("start");
				String end = req.getParameter("end");
				BoardService svc = new BoardServiceImpl();
				List<Map<String, Object>> list = svc.eventList();
				String json = gson.toJson(list);
				Map<String, String> map = new HashMap<>();
				map.put("title", title);
				map.put("startDate", start);
				map.put("endDate", end);
				
				try {
					if (svc.registerEvent(map)) { // {"retCode":"OK"}
						json = "{\"retCode\":\"OK\"}";
					}
				} catch (Exception e) {
					e.printStackTrace();
					json = "{\"retCode\":\"FAIL\"}";
				}

			

	

	}
}
