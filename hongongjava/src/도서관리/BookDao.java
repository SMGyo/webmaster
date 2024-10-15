package 도서관리;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao extends DAO {
	
	public int insert(Book book) {
		getOpen();
		try {
			String sql = "insert into book (title,writer,price,bnum)"
					+ " values (?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getWriter());
			pstmt.setInt   (3, book.getPrice());
			pstmt.setString(4, book.getBnum());
			int rows = pstmt.executeUpdate();
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return 0;
	}
//	public int select(String title) {
//		getOpen();
//		try {
//			String sql = "select * from book where title=?";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1,title);
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				Book bt = new Book();
//				bt.setTitle(rs.getString(1));
//				bt.setWriter(rs.getString(2));
//				bt.setPrice(rs.getInt(3));
//				bt.setBnum(rs.getString(4));
//				
//				System.out.println(bt);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return 0;
//	}
	public int delete(String bnum) {
		getOpen();
		try {
			String sql = "delete from book where bnum=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,bnum);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	public int update(String title,String writer,int price,String bnum) {
		getOpen();
		try {
			String sql = "update book set title=?,writer=?,price=? where bnum=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,title);
			pstmt.setString(2,writer);
			pstmt.setInt(3,price);
			pstmt.setString(4,bnum);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
}

