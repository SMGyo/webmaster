package chap04;

import java.util.Scanner;

public class Exam183 {

	public static void main(String[] args) {
		for(int i = 1 ; i<=10 ; i++) {
			int x=4*i;
			for(int j = 1 ; j<=10 ; j++) {
				int y=5*j;
				int result = x+y;
				if (result == 60) {
					System.out.print("("+i+","+j+")"+"\n");
			}
			}
		}
//		for(int i = 1; i<=4; i++) {
//			System.out.print("\n");
//			for(int j =1; j<=i; j++) {
//				System.out.print("*");
//			}
//		}
		
		for(int i = 1; i<=4 ; i++) {//반복횟수 i
			System.out.println();
			for(int j = 3; j>=i; j--) {//공백 3,2,1,0개 찍기
				System.out.print(" ");
				}
			for(int k = 1 ; k<=i ; k++) {//별1,2,3,4개 찍기
				System.out.print("*");
			}
		}
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {//Stop : while(run)
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			String bankNum = scanner.nextLine();
			switch(bankNum) {
			case "1":
				System.out.print("예금액>");
				int addNum = Integer.parseInt(scanner.nextLine());
				balance+=addNum;
				System.out.println(addNum);
				break;
			case "2":
				System.out.print("출금액>");
				int minusNum = Integer.parseInt(scanner.nextLine());
				if (balance<(int)minusNum) {
					System.out.println("출금액보다 잔고가 적습니다.출금가능액>"+balance);
				}else {
					balance-=minusNum;
				}
				System.out.println(minusNum);
				break;
			case "3":
				System.out.println(balance);
				break;
			case "4":
				run = false;//break Stop;
				break;
			default :
				System.out.println("잘못 입력");
				break;
			}
		}
		System.out.print("프로그램 종료\n");

	}//end main

}//end class
