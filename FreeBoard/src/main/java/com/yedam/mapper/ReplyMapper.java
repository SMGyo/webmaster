package com.yedam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.vo.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> selectList(int boardNo);

	List<ReplyVO> selectListPaging(@Param("bno") int boardNo, @Param("page") int page);

	int insertReply(ReplyVO reply);

	int deleteReply(int replyNo);

	ReplyVO selectReply(int replyNo);
	//댓글건수
	int selectCount(int boardNo);
}
