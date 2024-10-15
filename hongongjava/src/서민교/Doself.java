package 서민교;

import java.util.Scanner;

public class Doself {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
////		1번
//		System.out.print("##년도 입력");
//		int year = Integer.parseInt(sc.nextLine());
//		if(year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println("년은 윤년입니다."); 
//		}else {
//			System.out.println("년은 평년입니다."); 
//		}
////		2번
//		System.out.print("##교환할 금액 : ");
//		int money = Integer.parseInt(sc.nextLine());
//		
//		int mon500 = money%500;
//		int mon100 = mon500%100;
//		int mon50 = mon100%50;
//		System.out.println("500원 짜리 : "+money/500);
//		System.out.println("100원 짜리 : "+mon500/100);
//		System.out.println("50원 짜리 : "+mon100/50);
//		System.out.println("10원 짜리 : "+mon50/10);
//		System.out.println("교환 금액 : " + (int)(money-money%10)+"원");
//		System.out.println("남은 금액 : " + money%10+"원");
////		3번
//		int ranNum = (int)(Math.random()*100)+1;
//		Stop : while(true) {
//		System.out.print("숫자 입력 : ");
//		int inputNum = Integer.parseInt(sc.nextLine());
//		if(ranNum == inputNum) {
//			System.out.println("축하합니다!!");
//			break Stop;
//		}else if(ranNum < inputNum) {
//			System.out.println("down하세요!!");
//		}else if(ranNum > inputNum) {
//			System.out.println("up하세요!!");
//		}
//	}
//		4번
//		for(int i=1;i<=9;i++) {
//			System.out.print("  " + i + "단\t");
//		}
//		for(int i=2;i<=9;i++) {
//			System.out.println();
//			for (int j=1;j<=9;j++) {
//				System.out.printf("%dx%d=%2d\t",j,i,i*j);
//			}
//		}
//		5번
//		close : while(true) {
//			System.out.println("---------------");
//			System.out.println("1. 화씨 => 섭씨");
//			System.out.println("2. 섭씨 => 화씨");
//			System.out.println("3. 종료");
//			System.out.println("---------------");
//			System.out.print("번호 선택");
//			int tem = Integer.parseInt(sc.nextLine());
//			switch(tem) {
//			case 1 :
//				System.out.print("화씨 온도 입력");
//				int f = Integer.parseInt(sc.nextLine());
//				double ff = (double)5/9*(f-32);
//				System.out.printf("섭씨 온도 = %.6f \n" , ff);
//				break;
//			case 2 :
//				System.out.print("섭씨 온도 입력");
//				int f2 = Integer.parseInt(sc.nextLine());
//				double ff2 = (double)9/5*f2+32;
//				System.out.printf("화씨 온도 = %.6f \n" , ff2);
//				break;
//			case 3 :
//				System.out.println("program end");
//				break close;
//			}
//		}
//		6번
//		Out : while(true) {
//			int game = (int)(Math.random()*3);
//			System.out.print("## 가위(0) 바위(1) 보(2) : ");
//			int att = Integer.parseInt(sc.nextLine());
//			if(att>=3) {
//				System.out.print("GAME OVER");
//				break Out;
//			}else if(att-game==1 | att-game==-2) {
//				System.out.print("사람"+att+","+"컴"+game+"사람 승리");
//			}else if(att-game==2 | att-game==-1) {
//				System.out.print("사람"+att+","+"컴"+game+"컴 승리");
//			}else if(att-game==0) {
//				System.out.print("사람"+att+","+"컴"+game+"비겼음");
//			}
//		}
//		7번
//		int num = 0;
//		for (int i=1;i<=5;i++) {
//			System.out.println();
//			for(int j=1;j<=10;j++) {
//				num++;
//			if(num%10==3|num%10==6|num%10==9&&num/10==3) 
//			{
//				System.out.print("\t★★");
//			}else if(num%10==3 || num%10==6 || num%10==9) {
//				System.out.print("\t★");
//			}else if(num/10==3) {
//				System.out.print("\t★");
//			}else {
//				System.out.printf("\t%2d",num);
//			}
//			}
//		}
	
	}//end main
}//end class

