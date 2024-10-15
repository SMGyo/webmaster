package chap06;

public class Books {
	private String bookTitle;
	private String bookNumber;
	private int bookPrice;
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	Books(String bookTitle,String bookNumber,int bookPrice){};
	
	
}
