package chap06;

import java.util.Scanner;

public class BoosMain {

	public static void main(String[] args) {
		
		boolean run = true;
		int bNum = 0;
		Books[] myBooks = null;
		Scanner sc=new Scanner(System.in);
		while(run) {
		System.out.println("1.도서 수 입력 2.도서 입력 3.도서목록 조회 4.도서분석 5.종료");
		String menu;
		System.out.print("숫자를 입력하세요");
		menu = sc.nextLine();
		switch(menu) {
		case "1" :
		{
			bNum = Integer.parseInt(sc.nextLine());
					myBooks = new Books[bNum];					
			break;
		}
		case "2" :
			for(int i=0;i<=bNum-1;i++) {
			String getBookTitle = sc.nextLine();
			String getBookNumber = sc.nextLine();
			int getBookPrice = Integer.parseInt(sc.nextLine());
			myBooks[i]=new Books(getBookTitle,getBookNumber,getBookPrice);
			}
			break;
		case "3" :
			for(Books newB : myBooks) {
			System.out.printf("%s%s%d\n",newB.getBookTitle(),newB.getBookNumber(),newB.getBookPrice());
			}					
			break;
		case "4" :
			int sum = 0;
			String title = null;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(Books book:myBooks) {
				int x = book.getBookPrice();
				sum += x;
				if(max < x) {
					max = x;
					title = book.getBookTitle();
				}
				if (min > x) {
					min = x;
				}
			}
			System.out.printf("합 = %d, 최대 가격 = %d, 최소 가격 = %d\n", sum,max,min);
			System.out.println("가장 비싼 책 : " + title);
			break;
		case "5" :
			System.out.println("프로그램 종료");
			run = false;
		}
		}
		sc.close();
		
		
	}

}
