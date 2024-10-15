package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	Connection conn = null;
	PreparedStatement psmt;
	ResultSet rs;
	
	public void getOpen() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:Oracle:thin:@localhost:1521:xe",
					"java",
					"1234");
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void getClose() {
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
