package chap06;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	//getter setter
	private int maxSpeed = 350;
	private int speed;
	private int gas;
	private boolean stop;
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
//	public void setGasState(boolean gasState) {
//		this.gasState = gasState;
//	}
	//생성자
	//메소드
//	void setGas(int gas) {
//		this.gas=gas;
//	}
//	int getSpeed() {//speed값 리턴
//		return speed;
//	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:"+ gas + ")");
				return;
			}
		}
	}
	
	void run2() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		this.speed = speed;
	}
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
//	public boolean isGasState() {//boolean타입 : get대신 is씀
//		return gasState;
//	}

}//end class
