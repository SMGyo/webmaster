package chap03;

public class Assign146 {

	public static void main(String[] args) {
		int result = 0 ;
		result += 10; // result = result + 10;
		System.out.println(result);
		result -= 5; //result = result - 5;
		System.out.println(result);
		result *= 3; //result = result * 3;
		System.out.println(result);
		result /= 5; //result = result / 5;
		System.out.println(result);
		result %= 3; //result = result % 3;
		System.out.println(result);
		
		int su = 1;
		int su2 = 2;
		System.out.println(su & su2); // 두개다 true일때
		System.out.println(su | su2); // 하나라도 true
		System.out.println(su ^ su2); // 두개가 다를때

	}

}
