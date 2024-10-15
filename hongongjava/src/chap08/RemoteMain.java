package chap08;
		
public class RemoteMain {
	//공통된게 많으면 추상클래스 - 생성자o
	//공통된게 하나도 없으면 인터페이스를 쓰는것이 좋다 - 생성자x
		
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.setVolume(50);
		
		
		rc = new Audio();
		rc.setVolume(-5);
	}	
		
}
