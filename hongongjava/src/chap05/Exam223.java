package chap05;

import java.util.Scanner;

public class Exam223 {

	public static void main(String[] args) {
//		//문제6
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0;
		int max=0;
		System.out.print(avg);
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo) {
			case 1 : 
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				break;
			case 2 :
				for(int i=0;i<studentNum;i++) {
//					scores[i]+=scores[i];					
					System.out.print("scores["+i+"]");
					scores[i] = Integer.parseInt(scanner.nextLine());
					sum+=scores[i];
					avg=(double)sum/studentNum;
				}
				break;
			case 3 : 
				for(int i=0;i<studentNum;i++) {
					System.out.printf("scores[%d]>%d\n",i,scores[i]);
				}
				break;
			case 4 :
				for(int i=0;i<studentNum;i++) {
					if(max<scores[i]) {
						max=scores[i];
					}
				}
					System.out.printf("최고 점수 : %d \n평균 점수 : %.1f\n",max,avg);
				
				break;
			case 5 : run = false; 
			}
			}
		System.out.println("프로그램 종료");
		scanner.close();
	}//end main

}//end class
