package chap06;

public class BoardMain {

	public static void main(String[] args) {
		Board board1 = new Board("1","2");
		Board board2 = new Board("1","2","현재 컴퓨터 날짜");
		Board board3 = new Board("1","2","3","현재 컴퓨터 날짜");
		Board board4 = new Board("1","2","3","현재 컴퓨터 날짜",5);
		Board board = new Board();//기본생성자 사용
		board.title = "title값 변경";
		board.hitcount = 999;
		
		System.out.printf("%s : %s : %s : %s : %d\n",board1.title,board1.content,board1.writer,board1.date,board1.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board2.title,board2.content,board2.writer,board2.date,board2.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board3.title,board3.content,board3.writer,board3.date,board3.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board4.title,board4.content,board4.writer,board4.date,board4.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board.title,board.content,board.writer,board.date,board.hitcount);
	}

}
