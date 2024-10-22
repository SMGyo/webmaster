package com.yedam.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.common.SearchDTO;
import com.yedam.mapper.ReplyMapper;
import com.yedam.vo.BoardVO;
import com.yedam.vo.ReplyVO;

public class AppTest {
	public static void main(String[] args) {
		SqlSession sqlSession = DataSource.getInstance().openSession();
		ReplyMapper mapper = sqlSession.getMapper(ReplyMapper.class);
		
		SearchDTO search = new SearchDTO();
		search.setKeyword("user01");
		search.setSearchCondition("W");
		search.setPage(1);
		
		List<ReplyVO> list = mapper.selectList(149);
		for (ReplyVO bvo : list) {
			System.out.println(bvo.toString());
		}

//		BoardVO bvo = new BoardVO(); 
//		bvo.setTitle("mapper테스트");
//		bvo.setContent("정상 작동합니다.");
//		bvo.setWriter("user01");
//		BoardVO bvo = new BoardVO();
//		bvo.setTitle("mapper테스트");
//		bvo.setContent("정상 작동합니다.[수정]");
//		bvo.setWriter("user01");
//		bvo.setBoardNo(5);
//		BoardVO bvo = new BoardVO();
//		bvo.setTitle("mapper테스트");
//		bvo.setContent("정상 작동합니다.[조회]");
//		bvo.setWriter("user01");
//		bvo.setBoardNo(5);
		
//		if(mapper.insertBoard(bvo) == 1) {
//			sqlSession.commit();
//		}
//		if(mapper.updateBoard(bvo) == 1) {
//			sqlSession.commit();
//		}
//		if(mapper.deleteBoard(bvo.getBoardNo()) == 1) {
//			sqlSession.commit();
//		}
//		if(mapper.selectBoard(4) == null) {
//			System.out.println("조회된 내용이 없습니다");
//		}
//		List<BoardVO> list = mapper.boardList();
//		for (BoardVO bvo2 : list) {
//			System.out.println(bvo2.toString());
//		}

	}
}
