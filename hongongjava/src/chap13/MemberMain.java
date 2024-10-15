package chap13;

 import java.util.*;
 
public class MemberMain {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("최길동", 25));
		set.add(new Member("최길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수 : " + set.size());
		
		//set 전체 출력
		for(Member element : set) {
			System.out.printf("%s%s\n",element.name,element.age);
		}
		//반복자
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member element = iterator.next();
			System.out.println(element.name + element.age);
			System.out.println(element);
		}
	}

}
