package chap01;

import java.util.Scanner;

public class Exam120 {

	public static void main(String[] args) {
		//문제 1 : 출력문 연습
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123",tel3="4567";
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age +"\n");
		System.out.printf("전화 : %s-%s-%s" ,tel1,tel2,tel3);
		
		//문제 2 , 3 : scanner 이용 방법 연습
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두 번째 수:");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
		
		System.out.print("이름 : ");
		String stName = scanner.nextLine();
		
		System.out.print("주민번호 앞 6자리 : ");
		String psNum = scanner.nextLine();
		
		System.out.print("전화번호 : ");
		String phone1 = scanner.nextLine();
		System.out.print("");
		String phone2 = scanner.nextLine();
		System.out.print("");
		String phone3 = scanner.nextLine();
		System.out.println("이름 : " + stName);
		System.out.println("주민번호 앞 6자리 : " + psNum);
		System.out.printf("전화번호 %s-%s-%s" , phone1,phone2,phone3);
//		String phoneN = scanner.nextLine();
//		
//		System.out.println("이름 : " + stName);
//		System.out.println("주민번호 앞 6자리 : " + psNum);
//		System.out.println("전화번호 : " + phoneN);
		//문제 4 두수를 입력 받아서 큰수 - 작은수
		System.out.print("첫번째 숫자를 입력하세요");
		int fN = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		int sN = scanner.nextInt();
		if(fN>sN) {
			System.out.print(fN-sN);
		}else if(sN>fN) {
			System.out.print(sN-fN);
		}else if(fN==sN) {
			System.out.print("숫자가 같습니다.");
		}else {
			System.out.print("오류");
		}
		scanner.close();
	}//end main
}//end class
