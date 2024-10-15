package chap08_1;

public interface RemoteControl {//인터페이스 생성
	//상수
	public int MAX_VOLUME = 10;//상수 이름 대문자
	public int MIN_VOLUME = 0;//상수 이름 대문자
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
