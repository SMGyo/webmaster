package com.yedam.vo;

import java.util.Date;

import lombok.Data;


@Data // Getter Setter toString 기능
public class BoardVO {
	private int boardNo; //board_no - boardNo
	private String title;
	private String content;
	private String writer;
	private String writerName;
	private int viewCnt;
	private Date writeDate;
	private Date updateDate;
	private String img;
}
