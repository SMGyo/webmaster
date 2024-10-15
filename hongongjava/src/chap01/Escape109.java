package chap01;

public class Escape109 {

	public static void main(String[] args) {
//		char c1 = 'a';
//		char c2 = (char)(c1 + 1);
//		System.out.println(c2);
//		System.out.println((int)c2);
//		
//		int x = 5;
//		int y = 2;
//		double result = (double)x/y;
//		System.out.println(result);
//		
//		double var1 = 3.5;
//		double var2 = 2.7;
//		int result2 = (int)(var1 + var2);
//		System.out.println(result2);
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		String str = "홍길동";
		int result3 = (int) (var1+var2+var3+(int)Double.parseDouble(var4));
		//var1+var2+var3=6.3 var4 int = 3 6.3+3 = int 9.3  = 9
		System.out.println(result3);
		
		byte value1=Byte.parseByte("10");
	    int value2=Integer.parseInt("1000");
		float value3=Float.parseFloat("20.5");
		double value4=Double.parseDouble("3.14159");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4); 
		System.out.printf("값은 %d 내이름은 %s %.1f",value2,str,value3);
		//printf는 줄바꿈 안됨 다음꺼 출력시 바로옆에 출력됨
	
		
	}
}
