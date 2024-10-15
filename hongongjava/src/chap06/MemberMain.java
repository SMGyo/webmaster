package chap06;

public class MemberMain {

	public static void main(String[] args) {
		//객체 생성
		Member member1 = new Member(); //member1에 새로 Member 공간 생성함 		
		Member member2 = new Member("홍길동","hgd","hong",30);		
		
		System.out.println("이름 : " +member1.name+ "\n나이 : "+member1.age);
		
		//필드값 변경
		member1.name = "최하얀"; //변경할객체명.사용할필드명 = 변경할값
		member1.age = 23;
		 
		//필드 출력
		System.out.println("이름 : " +member1.name+ "\n나이 : "+member1.age);
		System.out.println(member2.name+member2.id+member2.password+member2.age);
	}
}
