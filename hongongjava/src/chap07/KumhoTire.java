package chap07;

public class KumhoTire extends Tire {//Tire에서 상속받아옴
	//필드
	
	//생성자
	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		accRotation++;
		if(accRotation < maxRotation) {//타이어수명체크
			System.out.println(location + "KumhoTire 수명" + (maxRotation - accRotation) + "회");
			return true;
		}else {//남은회전수가 0이 되면 펑크
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
