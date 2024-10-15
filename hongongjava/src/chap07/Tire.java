package chap07;

public class Tire {
	//필드
	public int maxRotation; //최대 회전수
	public int accRotation; // 1바퀴
	public String location; // 바퀴 앞뒤왼쪽오른쪽
	
	//생성자
	public Tire(String location,int maxRotation) {
		this.location = location;//타이어위치 초기화
		this.maxRotation = maxRotation;//최대 회전수 초기화
	}
	
	//메소드
	public boolean roll() {//타이어를 1회 회전시키기위한 메소드생성
		accRotation++;
		if(accRotation < maxRotation) {//타이어수명체크
			System.out.println(location + "Tire 수명" + (maxRotation - accRotation) + "회");
			return true;
		}else {//남은회전수가 0이 되면 펑크
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
