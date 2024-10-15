package chap06;

public class StudentMain {

	public static void main(String[] args) {
		// 객체 생성
		Student[] stuArr= {
		new Student("000001","일",90, 80, 75),
		new Student("000002","이",60,55, 77),
		new Student("000003","삼",50, 90, 68),
		new Student("000004","사",81, 62, 83),
		new Student("000005","오",100, 100, 100)};
		for (Student ele : stuArr) {
			System.out.println(ele);
			}
//		Student st1 = new Student("000001","일",0,0,0);
//		Student st2 = new Student("000002","이",0,0,0);
//		Student st3 = new Student("000003","삼",0,0,0);
//		Student st4 = new Student("000004","사",0,0,0);
//		Student st5 = new Student("000005","오",0,0,0);
//		
//		st1.score(90, 80, 75);
//		st2.score(60,55, 77);
//		st3.score(50, 90, 68);
//		st4.score(81, 62, 83);
//		st5.score(100, 100, 100);
	}

}
