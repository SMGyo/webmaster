package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {

	public static void main(String[] args) {
		// 데이터 조회
		// 연결
		Connection conn = null;
		
		//jdbc 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//연결
			conn = DriverManager.getConnection(
					"jdbc:Oracle:thin:@localhost:1521:xe",
					"java",
					"1234"
					);
			System.out.println("연결성공");
			
			//데이터 조회
			String sql = "select * "	//select * 테이블 전체 불러오기
						+"from boards "
						+"where bwriter=?";
			//where bwriter = ? bwriter 조건
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"글쓴이5");//bwriter가 글쓴이5 일때
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board bd = new Board();
				bd.setBno(rs.getInt(1));
				bd.setBtitle(rs.getString(2));
				bd.setBcontent(rs.getString(3));
				bd.setBwriter(rs.getString(4));
				bd.setBdate(rs.getDate(5));
				
				System.out.println(bd);
			}
			
			rs.close();
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊음");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
