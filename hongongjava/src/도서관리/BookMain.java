package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javadb.Board;

public class BookMain {
	static Scanner sc = new Scanner(System.in);
	static MemberDao mdao = MemberDao.getInstance();
//	static Member member = null;
	static Connection conn = null;

	public static void main(String[] args) {
		Member member = null;
//		BookDao selB = new BookDao();
		//로그인 체크.	
		while(true) {
		System.out.println("아이디를 입력>> ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력>> ");
		String pw = sc.nextLine();
		
		// 정상적인 로그인되면 "홍길동" 환영메세지.
		member = mdao.checkMember(id,pw); //String 타입에서 Member로 변경
		if(member != null) {//if(mdao.checkMember(id,pw) != null)
			System.out.println(member.getMemberName() + "님 환영합니다.");
			break;
		}
		System.out.println("아이디와 비밀번호를 확인하세요!");
		} //end of 로그인체크.
		
		//권한이 User => 도서관리 처리.
		if(member.getResponsibility().equals("User")) {
			bookManage();
		}else if(member.getResponsibility().equals("Admin")) {
			memberManage();
		}
		//권한이 Admin => 회원관리 처리.
		
	}//end of main.

	static void bookManage() {//도서관리.
		BookDao dao = new BookDao();
		int cnt = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("1.도서등록 | 2.도서검색 | 3.도서전체 조회 | 4.도서삭제 | 5.도서 정보 변경 | 6. 종료");
			System.out.println("메뉴선택 > ");
			int btn = Integer.parseInt(sc.nextLine());
			switch(btn) {
			case 1 :
				System.out.print("책 제목 : ");
				String title = sc.nextLine();
				System.out.print("책 지은이 : ");
				String writer = sc.nextLine();
				System.out.print("책 가격 : ");
				int price = Integer.parseInt(sc.nextLine());
				System.out.print("책 번호 : ");
				String bnum = sc.nextLine();
//				selB.addBook();
				Book books = new Book(title,writer,price,bnum);
				dao = new BookDao();
				cnt = dao.insert(books);
				if(cnt == 1) {
					System.out.println("추가 성공");
				}else {
					System.out.println("추가 실패");
				}
				break;
			case 2 :
//				Connection conn = null;
				try {
					Class.forName("oracle.jdbc.OracleDriver");
					conn = DriverManager.getConnection(
							"jdbc:Oracle:thin:@localhost:1521:xe",
							"java",
							"1234"
							);
					System.out.println("책 제목을 입력하세요");
					title = sc.nextLine();
					String sql = "select * from book where title=?";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, title);
					ResultSet rs = pstmt.executeQuery();
					while(rs.next()) {
						Book bt = new Book();
						bt.setTitle(rs.getString(1));
						bt.setWriter(rs.getString(2));
						bt.setPrice(rs.getInt(3));
						bt.setBnum(rs.getString(4));
						
						System.out.println(bt);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 :

				try {
					Class.forName("oracle.jdbc.OracleDriver");
					conn = DriverManager.getConnection(
							"jdbc:Oracle:thin:@localhost:1521:xe",
							"java",
							"1234"
							);
					String sql = "select * from book";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();
					while(rs.next()) {
						Book bt = new Book();
						bt.setTitle(rs.getString(1));
						bt.setWriter(rs.getString(2));
						bt.setPrice(rs.getInt(3));
						bt.setBnum(rs.getString(4));
						
						System.out.println(bt);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4 :
				System.out.println("삭제할 책번호를 입력하세요");
				bnum = sc.nextLine();
				String bnums = new String(bnum);
				cnt = dao.delete(bnums);
				break;
			case 5 :
				System.out.println("변경할 책번호를 입력하세요");
				bnums = sc.nextLine();
				System.out.println("변경할 책제목을 입력하세요");
				title = sc.nextLine();
				System.out.println("변경할 책저자를 입력하세요");
				writer = sc.nextLine();
				System.out.println("변경할 책가격을 입력하세요");
				price = Integer.parseInt(sc.nextLine());
				cnt = dao.update(title, writer, price, bnums);
				break;
			case 6 :
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}//end of while.
	}
	
	static void memberManage() {
		System.out.println("관리자메뉴입니다.");//회원관리.
//		List<Member> list = mdao.memberList();
		
//		System.out.println("↓↓↓↓↓↓↓↓↓↓회원목록↓↓↓↓↓↓↓↓↓↓");
//		for(Member member : list) {
//			System.out.println(member.toString());
//		}
		//회원목록 출력.

	}
}
