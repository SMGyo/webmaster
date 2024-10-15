package 도서관리2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDao {
	Connection conn = null;
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
}
