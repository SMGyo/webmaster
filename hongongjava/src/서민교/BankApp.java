package 서민교;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Account[] pp = new Account[100];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String data;
		int data1;
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
			System.out.println("--------------------------------------------");
			data=sc.nextLine();
			switch(data) {
			case "1" :
				System.out.print("계좌번호: ");
				String ano=sc.nextLine();
//				for (Account num : pp) {
//					if(num.getAno().equals(ano)) {
//						System.out.println("이미 생성된 계좌입니다.");
//						break;
//					}
//				}
				System.out.print("계좌주: ");
				String owner=sc.nextLine();
				System.out.print("초기입금액: ");
				int balance=Integer.parseInt(sc.nextLine());
				if(balance<Account.getMinBalance() || balance>Account.getMaxBalance()) {
					System.out.println("다시 입력해주세요!");
					break;
				}
				pp[count]=new Account(ano,owner,balance);
				count++;
				System.out.print("결과 : 계좌가 생성되었습니다.");

				break;
			case "2" :
				if(pp[0]==null) {
						System.out.println("조회할수있는 계좌가 없습니다.");
						break;
				}
				for(Account per:pp) {
					if(per != null) {
					System.out.printf("%s %s %d\n",per.getAno(),per.getOwner(),per.getBalance());
					}
				}
				break;
			case "3" :
				System.out.println("----");
				System.out.println("예금");
				System.out.println("----");
				System.out.println("계좌번호: ");
				data=sc.nextLine();
				for(Account per:pp) {
					if(per != null) {
						if(per.getAno().equals(data)){
							System.out.println("예금액: ");
							data1=Integer.parseInt(sc.nextLine());
							if(per.getBalance()+data1 > Account.getMaxBalance()) {
								System.out.println("다시 입력해주세요!");
								break;
								}
							if(data1<0) {
								System.out.println("다시 입력해주세요!");
								break;
							}
							per.setBalance(per.getBalance()+data1);
						}
					}
				}
				break;
				
			case "4" :
				System.out.println("----");
				System.out.println("출금");
				System.out.println("----");
				System.out.println("계좌번호: ");
				data=sc.nextLine();
				for(Account per:pp) {
					if(per != null) {
						if(per.getAno().equals(data)){
							System.out.println("출금액: ");
							data1=Integer.parseInt(sc.nextLine());
							if(per.getBalance()-data1 < Account.getMinBalance()) {
								System.out.println("다시 입력해주세요!");
								break;
							}
							if(data1<0) {
								System.out.println("다시 입력해주세요!");
								break;
							}
							per.setBalance(per.getBalance()-data1);
						}
					}
				}
				break;
			case "5" :
				System.out.println("프로그램종료");
				run = false;
			}
		}

	}

}
