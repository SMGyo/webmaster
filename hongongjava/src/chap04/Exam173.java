package chap04;

public class Exam173 {

	public static void main(String[] args) {
		//50에서 100까지 3의 배수 합 구하기
		//3의 배수 출력, 마지막에 3의 배수합 출력
		//3의 배수 갯수 출력
		float aaa=(float)154.43;
		int sum = 0;
		int count = 0;
		for(int i=50;i<=100;i++) {
			if (i%3 == 0) {
				sum += i;
				count++;
				System.out.print(i+"\t");
			}
		}
		System.out.println("\n3의 배수합:"+sum);
		System.out.println("3의 배수의갯수:"+count+"개");
		System.out.printf("%10.2f\n",aaa);//%바로 뒤에는 부족한 자리 채우기
																//다음수는 자릿수 .뒤에숫자는 소숫점 자리수
		//1에서 n까지의 합이 300이 넘는 순간 n값 구하기
		//7의 배수의 합이 300이 넘는 순간 7의 배수 찾기
		//while 문
		int hap = 0 ;
		int n = 1;
		while(hap<=300) {//조건식 (조건이 성립이 되면 계속 반복)
			n++;
			if(n%7==0) {
				hap+=n;
				System.out.println(n +","+ hap);
			}
		}
		System.out.println("합이 300이넘을때n값:"+n);
//if를 쓰지않고 7의 배수를 구하는법
	int su = 0;
	sum = 0;
	while(sum < 300) {
		su += 7;
		sum += su;
	}
	System.out.println("7의 배수 = " + su);
	System.out.println("7의 배수 합 = " + sum);
	
	//구구단 : 중첩 for문
	
	for(int i=2; i<10; i++) {
		System.out.print("  "+i+"단\t");
	}
	for(int i=1; i<10; i++) {
		System.out.println("");
		for(int j=2; j<10; j++) {
//			System.out.println("\t" + i +"x"+ j + "=" + (i*j));
			System.out.printf("%2dx%d=%2d\t",j,i,i*j);
		}
	}
	
	}//end main
}//end class
