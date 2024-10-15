package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMain {

	public static void main(String[] args) {
		//database 연결
		//jdbc 등록
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");//트라이캐치
			//db 연결
			conn = DriverManager.getConnection(//캐치만 ,드라이버연결
					"jdbc:oracle:thin:@localhost:1521:xe",//url
					"java",//아이디
					"1234"//비밀번호
					);
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {// 연결이 되어있는 상태 .. 연결 끊어야함
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
