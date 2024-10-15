package chap13;

import java.util.*;

public class HashSetMain {

	public static void main(String[] args) {
		// set : 순서 보장 안됨, 중복 객체 저장 안됨, 반복자 필요함
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//같은거 두번 저장 안됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {//객체 수만큼 루핑
			String element = iterator.next();//1개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");//삭제
		set.remove("iBATIS");//삭제
		
		System.out.println("총 객체 수: " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {// 객체 수만큼 루핑
			System.out.println("\t" + element);
		}
		
		set.clear();//전체삭제
		if(set.isEmpty()) {System.out.println("비어 있음"); }
		
		
		
		
		
		
		
	}

}
