package chap13;

import java.util.*;//ctrl+shift+o

public class ArrayListMain {

	public static void main(String[] args) {
		//List컬렉션
		//ArrayList
		List<String>list = new ArrayList<String>();//인터페이스 생성
		
		list.add("Java");//리스트 추가
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size();//size에 리스트 갯수 저장
		System.out.println("총 객체 수: " + size);//list 수 출력
		System.out.println();
		
		String skill = list.get(2);//배열 2에 저장된 값 가져오기
		System.out.println("2: " + skill);//배열 2 출력
		System.out.println();
		
		for(int i=0; i<list.size(); i ++) {//for문으로 list 전체값 출력하기
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);		//배열2번 삭제
		list.remove(2);		//배열2번 삭제
		list.remove("iBATIS"); //배열에 있는 iBATIS 삭제
		
		for(int i=0; i<list.size(); i++) {//for문으로 list 전체값 출력하기
			String str = list.get(i);
		System.out.println(i + ":" + str);
		}
		for(String obj : list) {//향상된 for문
			System.out.println(obj);
		}
	}

}
