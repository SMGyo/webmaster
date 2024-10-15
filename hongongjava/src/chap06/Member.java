package chap06;

public class Member {
	//필드
	String name;//타입지정 필드명지정
	String id;
	String password;
	int age;
	//생성자
	Member(){}//기본생성자 명시적으로 생성
	Member(String name,String id,String password,int age){
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	//메소드
}
