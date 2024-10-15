package chap04;

public class Exam162 {

	public static void main(String[] args) {
		// 주사위 2개를 뎐져서 합이 5가 되면 종료 - game over
		// 5가 아니면 (x,y) 주사위 눈 표시
		// 몇번만에 나왔는지
		int i = 0;
		while(true) {
		int x = (int)(Math.random() *6) +1;
		int y = (int)(Math.random() *6) +1;
		i++;
		System.out.printf("%d번째(%d,%d) \n",i,x,y);
		if (x+y==5) {
			System.out.println("game over");
			break;
			}
		}
		//주사위 눈이 1이면 1등 ~ 6이면 6등이라고 출력
		int z = (int)(Math.random() *6) +1;
		if(z == 1) {
			System.out.println("1등");
		}else if(z == 2) {
			System.out.println("2등");
		}else if(z == 3) {
			System.out.println("3등");
		}else if(z == 4 ) {
			System.out.println("4등");
		}else if(z == 5) {
			System.out.println("5등");
		}else {
			System.out.println("6등");
		}
		switch(z) {
		case 1:System.out.println("1등");break;
		case 2:System.out.println("2등");break;
		case 3:System.out.println("3등");break;
		case 4:System.out.println("4등");break;
		case 5:System.out.println("5등");break;
		default:System.out.println("6등");break;
		}
		System.out.println(z+"등");
		
		//50에서 100까지 수를 발생
		//90이상이면 A, 80이상이면 B, .... 60이상 D, 나머지 F
		int a = (int)(Math.random()*51)+50;
		System.out.print("점수 : "+a+"\t");//a값 확인
		switch(a/10*10) {
		case 100:
		case 90:System.out.println("A");break;
		case 80:System.out.println("B");break;
		case 70:System.out.println("C");break;
		case 60:System.out.println("D");break;
		default:System.out.println("F");break;
		}
		
		
	}//end main
}//end class
