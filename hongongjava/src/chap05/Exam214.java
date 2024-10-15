package chap05;

public class Exam214 {

	public static void main(String[] args) {
//		int[][] scores = {
//				{10,20,30},//1/012
//				{40,50,60} //2/012
//		};
//		for(int i=0; i<scores.length;i++) {
//			for(int j=0; j<scores[i].length;j++) {
//				System.out.print(scores[i][j]);
//			}
//			System.out.println();
//		}
//		
		//2*3배열을 선언하고
		//1에서 10까지 무작위 수를 입력하세요
		int[][] nums = new int[2][3];
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums[i].length;j++) {
				nums[i][j]=(int)(Math.random()*10)+1;
				System.out.print("\t"+nums[i][j]);
			}
			System.out.println();
			}
		int max = 0;
		int row=0;
		int cal=0;
		int[][] gugu = new int[9][9];
		for(int i=0; i<gugu.length;i++) {
			for(int j=0; j<gugu[i].length;j++) {
				gugu[i][j]=(int)(Math.random()*99)+1;
				System.out.printf(" %2d",gugu[i][j]);
				if(max<gugu[i][j]) {
					max=gugu[i][j];
					row=i;
					cal=j;
				}
			}
			System.out.println();
		}
		System.out.printf("최대값 : %d 위치 (%d,%d)\n",max,row,cal);
		//향상된 for 문
		int[] su = {10,200,30,40,-50,777,555};
		//배열의 합,최대값,최소값을 구하세요
		//향상된 for문을 이용
		int sum = 0;
		max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int ele : su) {
			sum += ele;
			if(ele>max) {
				max=ele;
			}else if(ele<min) {
				min=ele;
			}
			
		}
		System.out.printf("sum = %d max = %d min = %d",sum,max,min);
	}//end main
}//end class
