package chap13;

public class Board {
	//필드
//	String subject;
	private String content;
//	String writer;
	private String title;

	//생성자
	public Board(String title,String content) {
		this.title = title;
		this.content = content;
	}
	//메소드
	public String getTitle() {return title;}
	public String getContent() {return content;}
//	@Override
//	public String toString() {
////		return super.toString();
//		return subject + " : " + content + " : " + writer;
//	}
	
}
