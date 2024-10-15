package 도서관리2;

public class Book {
	private String title;
	private String writer;
	private int price;
	private String bnum;
	
	public Book(String title,String writer, int price,String bnum){
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.bnum = bnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBnum() {
		return bnum;
	}
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	@Override
	public String toString() {
		return title + writer + price + bnum;
	}
}
