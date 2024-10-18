package com.yedam.common;

import java.util.List;

import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;
import com.yedam.vo.BoardVO;

import lombok.Data;

@Data
public class PageDTO {

	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private int page;

	public PageDTO(int page,int totalCnt) {
		BoardService dfdf = new BoardServiceImpl();
		List<BoardVO> hh = dfdf.board();
//		int totalCnt = hh.size(); // 13페이지 마지막.
		this.endPage = (int) Math.ceil(page / 10.0) * 10;
		this.startPage = this.endPage - 9;

		int realEnd = (int) Math.ceil(totalCnt / 5.0);// 건수 계산 => 최종페이지.
		this.endPage = this.endPage > realEnd ? realEnd : this.endPage;

		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
		this.page=page;
	}
}
