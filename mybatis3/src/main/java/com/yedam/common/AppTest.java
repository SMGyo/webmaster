package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.dao.MemberMapper;
import com.yedam.vo.Member;

public class AppTest {
	public static void main(String[] args) {
//		MemberDAO dao = new MemberDAO();
		SqlSession sqlSession = DataSource.getInstance().openSession();
		MemberMapper dao = sqlSession.getMapper(MemberMapper.class);
		// 등록.
		Member mbr = new Member();
		mbr.setMemberId("20241016");
		mbr.setMemberName("연습1016");
		mbr.setPhone("010-2024-1016");
		mbr.setPassword("1016");

		if (dao.insertMember(mbr) == 1) {
			sqlSession.commit();

		}
//		if (dao.updateMember(mbr) == 1) {
//			sqlSession.commit();
//
//		}
//		if (dao.deleteMember(mbr.getMemberId()) == 1) {
//			sqlSession.commit();
//		}

		List<Member> result = dao.members();
		for (Member member : result) {
			System.out.println(member.toString());
		}
	}
}
