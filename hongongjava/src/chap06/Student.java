package chap06;

public class Student {
	//필드(속성)
	String StuNum;
	String StuName;
	int A;
	int B;
	int C;
	
	//생성자(객체 생성) -> 객체의 속성을 초기화
	Student(String StuNum, String StuName,int A,int B,int C){//이름(타입 변수이름)
		this.StuNum = StuNum;
		this.StuName = StuName;
		this.A = A;
		this.B = B;
		this.C = C;
	}
	//메소드(기능)
	void score(int A,int B,int C) {
		int score;
		double avg;
		score=A+B+C;
		avg=(double)score/3;
		switch((int)avg/10) {
		case 10:
		case 9:System.out.printf("학번 : %s 이름 : %s 국어 : %d \t 영어 : %d \t 수학 : %d \t 총점 : %d 평균 : %.1f\t 등급 :A\n",StuNum,StuName,A,B,C,score,avg);break;
		case 8:System.out.printf("학번 : %s 이름 : %s 국어 : %d \t 영어 : %d \t 수학 : %d \t 총점 : %d 평균 : %.1f\t 등급 :B\n",StuNum,StuName,A,B,C,score,avg);break;
		case 7:System.out.printf("학번 : %s 이름 : %s 국어 : %d \t 영어 : %d \t 수학 : %d \t 총점 : %d 평균 : %.1f\t 등급 :C\n",StuNum,StuName,A,B,C,score,avg);break;
		case 6:System.out.printf("학번 : %s 이름 : %s 국어 : %d \t 영어 : %d \t 수학 : %d \t 총점 : %d 평균 : %.1f\t 등급 :D\n",StuNum,StuName,A,B,C,score,avg);break;
		default:System.out.printf("학번 : %s 이름 : %s 국어 : %d \t 영어 : %d \t 수학 : %d \t 총점 : %d 평균 : %.1f\t 등급 :F\n",StuNum,StuName,A,B,C,score,avg);break;
		}
		
	}
	void study() {
		System.out.println("공부합니다");
	}

}//end class